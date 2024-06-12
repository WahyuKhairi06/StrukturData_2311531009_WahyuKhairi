package TugasGRAF;

import java.util.*;

public class BFS {
	    static class Graph {
	        int V;  
	        LinkedList<Integer>[] adjList;

	        public Graph(int V) {
	            this.V = V;
	            adjList = new LinkedList[V];
	            for (int i = 0; i < V; i++) {
	                adjList[i] = new LinkedList<>();
	            }
	        }

	        public void addEdge(int u, int v) {
	            adjList[u].add(v);
	        }
	    }

	    public static void bfs(Graph graph, int startVertex) {
	        boolean[] visited = new boolean[graph.V];
	        Queue<Integer> queue = new LinkedList<>();
	        visited[startVertex] = true;
	        queue.add(startVertex);

	        while (!queue.isEmpty()) {
	            int currentVertex = queue.poll();
	            System.out.print(currentVertex + " ");
	            LinkedList<Integer> neighbors = graph.adjList[currentVertex];
	            for (int neighbor : neighbors) {
	                if (!visited[neighbor]) {
	                    visited[neighbor] = true;
	                    queue.add(neighbor);
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int V = 6; 
	        Graph graph = new Graph(V);
	        graph.addEdge(0, 1);
	        graph.addEdge(0, 2);
	        graph.addEdge(1, 2);
	        graph.addEdge(1, 3);
	        graph.addEdge(2, 3);
	        graph.addEdge(2, 4);
	        graph.addEdge(3, 5);

	        int startVertex = 0;
	        System.out.println("Breadth-First-Search Traversal (starting from vertex " + startVertex + "): ");
	        bfs(graph, startVertex);
	    }
	}