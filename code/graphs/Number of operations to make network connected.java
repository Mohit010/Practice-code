class Solution {

    int dfs(int u,List<Integer>graph[],boolean vis[]){
        if(vis[u] == true){
            return 0;
        }
        vis[u] = true;

        for(int v : graph[u]){
            dfs(v,graph,vis);
        }
        return 1;
    }

    public int makeConnected(int n, int[][] connections) {
        if(connections.length < n-1){
            return -1;
        }
        List<Integer>graph[] = new List[n];
        for(int i=0;i<n;i++){
            graph[i] = new ArrayList<>();
        }
        for(int c[] : connections){
            graph[c[0]].add(c[1]);
            graph[c[1]].add(c[0]);
        }

        int components = 0;
        boolean vis[] = new boolean[n];
        for(int j=0;j<n;j++){
            components += dfs(j,graph,vis);
        }
        return components - 1;
    }
}