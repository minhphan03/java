bfs(Graph graph, Vertex start) {
    Queue<Vertex> perimeter = new ArrayDeque<>();
    Set<Vertex> visited = new HashSet<>();

    perimeter.add(start);
    visited.add(start);

    while (!perimeter.isEmpty()) {
        Vertex from = perimeter.remove();
        // Process the current vertex by printing it out
        System.out.println(from);

        for (Edge edge : graph.neighbors(from)) {
            Vertex to = edge.to;
            if (!visited.contains(to)) {
                perimeter.add(to);
                visited.add(to);
            }
        }
    }
}
