public class DepthFirstSearch<V> extends Search<V> {

    public DepthFirstSearch(MyGraph<V> graph, V source) {
        super(source);
        deep(graph, source);
    }

    private void deep(MyGraph<V> graph, V source) {
        marked.add(source);

        for (V value : graph.getVertex(source).getAdjacentVerticesData()) {
            if (!marked.contains(value)) {
                edgeTo.put(value, source);
                deep(graph, value);
            }
        }
    }
}