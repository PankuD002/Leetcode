class Solution {
    public boolean validPath(int n, int[][] edges, int src, int dest) {
        List<Integer>[] graph = new ArrayList[n];
        for(int i=0; i<n; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];

            graph[u].add(v);
            graph[v].add(u);
        }

        boolean[] visited = new boolean[n];
        return hasPath(graph,src,dest,visited);
    }
   
public boolean hasPath(List<Integer>[] graph, int src, int dest, boolean[] visited){
    if(src==dest){
        return true;
    }

    visited[src] = true;
    List<Integer> l = graph[src];
    for(Integer e : l){
        if(visited[e]==false){
            boolean a = hasPath(graph,e,dest,visited);
            if(a) return true;
        }
    }
    return false;
}
}