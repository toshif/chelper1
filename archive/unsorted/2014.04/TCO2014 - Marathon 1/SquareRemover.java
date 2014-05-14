/**
 * Created by desc on 4/21/14.
 */
public class SquareRemover {

    boolean debug = false;

    int N; // size of board
    int[][] b; // board
    int[] C; // color buffer
    int bcnt = 0; // buffer counter
    int colors;
    int[][] blocked;
    boolean[][] used;

    int M = 30000;
    int[] ret = new int[M];
    int cnt = 0;

    public int[] playIt(int colors, String[] board, int startSeed){
        this.colors = colors;
        N = board.length;
        b = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                b[i][j] = Integer.parseInt("" + board[i].charAt(j));
            }
        }
        blocked = new int[N][N];
        used = new boolean[N][N];

        int[] A = new int[1000_000];
        C = new int[A.length];
        A[0] = startSeed;
        for (int i = 1; i < A.length; i++) {
            A[i] = (int)((((long)A[i-1]) * 48271L) % (2147483647L));
        }
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] % colors;
        }

        //System.err.println("C="+Arrays.toString(C));

        int loop = 0;
        while(cnt < 30000){
            find();
            System.err.println("found. cnt = " + cnt);
        }

        return ret;
    }

    void find(){
        int mi = 10000000;
        int miX = 0;
        int miY = 0;
        int miColor = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1; j++) {
                for (int k = 0; k < colors; k++) {
                    int[][] bo = cloneBoard();
                    int cost = findMin(i, j, k, bo, false);
                    if (cost < mi ){
                        mi = cost;
                        miX = i;
                        miY = j;
                        miColor = k;
                    }
                }
            }
        }

        //System.err.printf("miX=%s,miY=%s,miColor=%s,mi=%s\n", miX, miY, miColor,mi);

        findMin(miX, miY, miColor, b, true);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                // System.err.printf("replace x=%s,y=%s,newColor=%s\n", miX + i, miY + j, C[bcnt]);
                b[miX + i][miY + j] = C[bcnt];
                bcnt++;
            }
        }
    }

    int[][] cloneBoard(){
        int[][] bo = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                bo[i][j] = b[i][j];
            }
        }
        return bo;
    }

    int findMin(int x, int y, int color, int[][] bo, boolean prod){
        for (int i = 0; i < N; i++) {
            Arrays.fill(blocked[i], 0);
            Arrays.fill(used[i], false);
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                blocked[x+i][y+j] = 1;
            }
        }

        int cost = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (bo[x+i][y+j] != color) {
                    int cost1 = bfs(x+i,y+j,color,bo);
                    if (cost1 == -1) return 1000_000;
                    cost += cost1;
                    int[] flips = flip(ans, bo, prod);
                    if (prod){
                        for (int k = 0; k < flips.length; k++) {
                            if (cnt < M){
                                ret[cnt] = flips[k];
                                cnt++;
                            }
                        }
                    }
                }
            }
        }
        return cost;
    }

    //  0 -- up, 1 -- right, 2 -- down, 3 -- left.
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    class P {
        int x;
        int y;
        int cost;
        P prev;
        int move;
    }

    P ans;

    int bfs(int x, int y, int color,int[][] bo){
        Queue<P> q = new LinkedList<>();
        P p0 = new P();
        p0.x = x;
        p0.y = y;
        p0.cost = 0;
        q.add(p0);

        int cost = 0;
        while(true){
            P p = q.poll();

            if (p == null){
                return -1;
            }

            if (bo[p.x][p.y] == color){
                ans = p;
                return p.cost;
            }

            for (int i = 0; i < dx.length; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (0<=nx && nx < N && 0<= ny && ny < N && blocked[nx][ny] == 0 && !used[nx][ny]){
                    used[nx][ny] = true;
                    P nextP = new P();
                    nextP.x = nx;
                    nextP.y = ny;
                    nextP.move = i;
                    nextP.cost = p.cost + 1;
                    nextP.prev = p;
                    q.add(nextP);
                }
            }
        }
    }

    int[] flip(P p, int[][] bo, boolean prod){
        List<Integer> moves = new ArrayList<>();
        int move = p.move;
        P prev = p.prev;
        while(prev != null){
            int fromX = prev.x;
            int fromY = prev.y;
            int toX = prev.x + dx[move];
            int toY = prev.y + dy[move];

            moves.add(fromX);
            moves.add(fromY);
            moves.add(move);

            int prevColor = bo[fromX][fromY];

            bo[fromX][fromY] = bo[toX][toY];
            bo[toX][toY] = prevColor;

            if (prod) {
                System.err.printf("added %s, %s, %s\n", fromX, fromY, move);
                //System.err.printf("(%s,%s)<->(%s,%s)\n", fromX, fromY, toX, toY);
            }

            move = prev.move;
            prev = prev.prev;
        }

        int[] ret = new int[moves.size()];
        for (int i = 0; i < moves.size(); i++) {
            ret[i] = moves.get(i);
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int colors = in.nextInt();
        int N = in.nextInt();
        in.nextLine();

        String[] board = new String[N];
        for (int i = 0; i < N; i++) {
            board[i] = in.nextLine();
            System.err.println("board " + i + " = " + board[i]);
        }

        int startSeed = in.nextInt();

        int[] ret = new SquareRemover().playIt(colors, board, startSeed);

        for (int i = 0; i < 30000; i++) {
            System.out.println(ret[i]);
        }

        System.out.flush();
    }
}
