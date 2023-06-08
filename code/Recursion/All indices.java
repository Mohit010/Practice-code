public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
    if(idx == arr.length){
        return new int[fsf];
    }
    
    if(arr[idx] == x){
       int iarr[] = allIndices(arr,x,idx+1,fsf+1);
       iarr[fsf] = idx;
       return iarr;
    }else{
       int iarr[] = allIndices(arr,x,idx+1,fsf);
       return iarr;
    }
}