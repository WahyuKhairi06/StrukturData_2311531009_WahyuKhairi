package TugasGRAF;

import java.util.*;

public class DFS
{
	static class Graph
	{
		int V; //Untuk jumlah verteks
		
		LinkedList<Integer>[] adj; 
		
		Graph(int V)
		{
			this.V = V;
			adj = new LinkedList[V];
			
			for (int i = 0; i < adj.length; i++)
				adj[i] = new LinkedList<Integer>();
			
		}
		
		//To add an edge to graph
		void addEdge(int v, int w)
		{
			adj[v].add(w); // untuk menambahkan w ke v
		}
		
		void DFS(int s)
		{
			Vector<Boolean> visited = new Vector<Boolean>(V);
			for (int i = 0; i < V; i++)
				visited.add(false);
	
			// membuat tumpukan ntuk DFS
			Stack<Integer> stack = new Stack<>();
			
			// untuk mem push node 
			stack.push(s);
			
			while(stack.empty() == false)
			{
				// untuk mengeluarkan simpul dari tumpukan
				s = stack.peek();
				stack.pop();
				
				if(visited.get(s) == false)
				{
					System.out.print(s + " ");
					visited.set(s, true);
				}
				Iterator<Integer> itr = adj[s].iterator();
				
				while (itr.hasNext()) 
				{
					int v = itr.next();
					if(!visited.get(v))
						stack.push(v);
				}
				
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Graph g = new Graph(5);
		
		g.addEdge(1, 0);
		g.addEdge(0, 2);
		g.addEdge(2, 1);
		g.addEdge(0, 3);
		g.addEdge(1, 4);
			
		int startvertex = 0;
		System.out.println("Berikut adalah Output dari Depth First Search Traversal : ");
		g.DFS(0);
	}
}
