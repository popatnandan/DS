import java.util.LinkedList;
import java.util.Queue;

class Graph
{
    int numvertices;
    LinkedList <Integer>[] adjLists;
    boolean [] visited;

    public Graph(int numvertices)
    {
        this.numvertices = numvertices;
        adjLists = new LinkedList[numvertices];
        visited = new boolean[numvertices];
        for(int i=0;i<numvertices;i++)
        {
            adjLists[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src,int dest)
    {
        adjLists[src].add(dest);
        adjLists[dest].add(src);//undirected graph
    }
    
    public void DFS(int vertex)
    {
        visited[vertex]=true;
        System.out.println(vertex+"");

        for(int adj:adjLists[vertex])
        {
            if(!visited[adj])
            {
                DFS(adj);
            }
        }
    }
    void BFS(int s)
    {
        boolean visited[] = new boolean[numvertices];
        Queue<Integer>queue=new LinkedList<Integer>();
        visited[s]=true;
        while(!queue.isEmpty())
        {
            s=queue.poll();
            System.out.print(s+"");
            for(int i:adjLists[s])
            {
                if(!visited[i])
                {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
public class GraphImplementation {
    public static void main(String[] args)
    {
        Graph graph=new Graph(5);
        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
    
        System.out.println("Bredth-first Search Starting from vertex 0:");
        graph.BFS(0);
        System.out.println("Depth-first Search Starting from vertex 0:");
        graph.DFS(0);
        
    }
}
