package utils.graph;

public class Edge {
    public int from;
    public int to;
    public long val;

    public Edge(int from, int to, long val) {
        this.from = from;
        this.to = to;
        this.val = val;
    }

    @Override
    public String toString() {
        return String.format("Edge<from=%s,to=%s,val=%s>", from, to, val);
    }
}
