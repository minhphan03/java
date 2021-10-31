dfs(Graph graph, Vertex start) {
    dfs(graph, start, new HashSet<>());
}

dfs(Graph graph, Vertex from, Set<Vertex> visited) {
    // Process the current vertex by printing it out
    System.out.println(from);
    visited.add(from);

    for (Edge edge : graph.neighbors(from)) {
        Vertex to = edge.to;
        if (!visited.contains(to)) {
            dfs(graph, to);
        }
    }
}
