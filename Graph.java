import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Other than adjacent matrix and adjacency list, I have implemented edge list for graph representation and storage
public class Graph {
    private int numVertices; // Number of vertices in the graph
    private LinkedList<Integer>[] adjList; // Adjacency list representation
    private List<int[]> edgeList; // Edge list representation

    public Graph(int vertices) {
        this.numVertices = vertices;
        this.adjList = new LinkedList[vertices];
        this.edgeList = new ArrayList<>(); // Using ArrayList to store the edge list
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Method to add an edge to the graph
    public void addEdge(int start, int end) {
        adjList[start].add(end); // Add the edge to the adjacency list
        adjList[end].add(start);
        edgeList.add(new int[]{start, end}); // Add the edge to the edge list
    }

    // Method to print the adjacency list
    public void printAdjList() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + i + ":");
            for (Integer neighbour : adjList[i]) {
                System.out.print(" -> " + neighbour);
            }
            System.out.println();
        }
    }

    // Method to print the edge list
    public void printEdgeList() {
        System.out.println("Edge List:");
        for (int[] edge : edgeList) {
            System.out.println(edge[0] + " - " + edge[1]);
        }
    }

    public static void main(String[] args) {
        int vertices = 4; // Define the number of vertices
        Graph graph1 = new Graph(vertices);
        // Adding edges between every pair of vertices
        for (int i = 0; i < vertices; i++) {
            for (int j = i + 1; j < vertices; j++) {
                graph1.addEdge(i, j);
            }
        }
        graph1.printAdjList(); // Print the adjacency list representation
        graph1.printEdgeList(); // Print the edge list representation
    }
}
