class Solution {
    public void setZeroes(int[][] matrix) {
        // int row[] = new int[matrix.length];
        // int col[] = new int[matrix[0].length];
        ArrayList<Integer>row = new ArrayList<>();
        ArrayList<Integer>col = new ArrayList<>();
        

        for(int i=0;i<matrix.length;i++){
          for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j] == 0){
                     row.add(i);
                     col.add(j);
                }
            }
        }
        for(int a : row){
            int b = a;
            for(int i=0;i<matrix[0].length;i++){
                matrix[b][i] = 0;
            }
        }
        for(int e : col){
            int f = e;
            for(int g=0;g<matrix.length;g++){
                matrix[g][f] = 0;
            }
        }

        // for(int c=0;c<matrix.length;c++){
        //     for(int d=0;d<matrix[0].length;d++){
        //         System.out.print(matrix[c][d] + " ");
        //     }
        //     System.out.println();
        // }
    }
   
}

