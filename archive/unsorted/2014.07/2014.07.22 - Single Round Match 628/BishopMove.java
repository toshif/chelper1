package fuku;

public class BishopMove {
    public int howManyMoves(int r1, int c1, int r2, int c2) {
        int r = Math.abs(r2 - r1);
        int c = Math.abs(c2 - c1);

        if (r == 0 && c == 0) return 0;

        if ((r + c) % 2 != 0) return -1;

        if (r == c) return 1;

        return 2;
    }
}
