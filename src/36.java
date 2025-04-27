public class MathHomework {
    public static void main(String[] args) {
        // Example of an assignment problem
        int[][] graph = {{0, 15, 7},
                         {15, 0, 8},
                         {7, 8, 0}};
        
        int numVertices = graph.length;
        int totalEdges = graph[0][0] + graph[0][1];
        
        // Example of an assignment problem solution
        System.out.println("Graph:");
        for (int[] row : graph) {
            System.out.print("[");
            for (int col : row) {
                System.out.print(col);
                if (col != 8)
                    System.out.print(", ");
            }
            System.out.print("]\n");
        }
        
        int minCost = Integer.MAX_VALUE;
        int[] verticesToBeReplaced = new int[numVertices];
        
        // Greedy algorithm for finding minimum spanning tree
        for (int i = 0; i < numVertices - 1; i++) {
            int minCostSoFar = Integer.MAX_VALUE;
            for (int j = 0; j < numVertices - 1; j++) {
                if (!verticesToBeReplaced[j]) {
                    int cost = graph[i][j];
                    verticesToBeReplaced[j] = true;
                    if (cost < minCostSoFar) {
                        minCostSoFar = cost;
                        for (int k = i + 1; k < numVertices - 1 && !verticesToBeReplaced[k]; k++) {
                            int tempCost = graph[i][k] + graph[k][j];
                            if (tempCost < verticesToBeReplaced[k])
                                verticesToBeReplaced[k] = true;
                        }
                    }
                }
            }
        }
        
        // Print the minimum spanning tree
        for (int i = 0; i < numVertices - 1; i++) {
            if (!verticesToBeReplaced[i]) {
                int costSoFar = graph[i][i];
                System.out.print("Vertex " + i + ": ");
                for (int j = i + 1; j < numVertices - 1 && !verticesToBeReplaced[j]; j++) {
                    System.out.print(graph[i][j] + ", ");
                }
                System.out.println(costSoFar);
            }
        }
    }
}
