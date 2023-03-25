class Solution {
    List<List<Integer>>gr = new ArrayList<>();
    public long countPairs(int n, int[][] edges) {
         for(int i=0;i<n;i++){
             gr.add(new ArrayList<>());
         }
         for(int []edge : edges){
             gr.get(edge[0]).add(edge[1]);
             gr.get(edge[1]).add(edge[0]);
         }

         long res = 0;
         long  sum = n;
         boolean visited[] = new boolean[n];
         for(int i=0;i<n;i++){
             if(!visited[i]){
                 int curr = dfs(i,visited,new int[1]);
                 sum = sum-curr;
                 res += curr*sum;
             }
         }
         return res;
    }

    int dfs(int node,boolean visited[],int count[]){
        if(visited[node]){
            return count[0];
        }
        visited[node] = true;
        count[0]++;
        for(int i : gr.get(node)){
            dfs(i,visited,count);
        }
        return count[0];
    }
}