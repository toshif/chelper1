package utils.graph;

public class Edge {
    public int from;
    public int to;
    public long cost;

    public Edge(int from, int to, long cost) {
        this.from = from;
        this.to = to;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return String.format("Edge<from=%s,to=%s,cost=%s>", from, to, cost);
    }
}
