import java.util.*;

class GraphEasy{
  public static void main(String[] args) {
        int[][] graph = {
            {1, 1, 1, 0, 0}, // Node 0
            {1, 1, 0, 1, 1}, // Node 1
            {1, 0, 1, 0, 0}, // Node 2
            {0, 1, 1, 0, 0}, // Node 3
            {0, 1, 0, 1, 0}  // Node 4
        };

        int startNode = 0;

        bfs(graph, startNode); // You implement this method
    }

  public static void bfs(int[][] graph, int startNode){
    Queue<Integer> queue = new ArrayDeque<>();
    boolean[] visited = new boolean[graph.length];

    queue.add(startNode);
    visited[startNode] = true;

    while(!queue.isEmpty()){
      int node = queue.poll();
      System.out.print(node+" ");

      for(int edge=0; edge < graph[node].length; edge++){
          if(graph[node][edge] == 1 && !visited[edge]){
            queue.add(edge);
            visited[edge] = true;
          }
      }
    }

  }
}
