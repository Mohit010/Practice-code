class Solution {
    public void sortColors(int[] arr) {
        //Method 1..
        // Arrays.sort(nums);

    // Method 2....
    //     int n = arr.length;
    //     int i, j, temp;
    //     boolean swapped;
    //     for (i = 0; i < n - 1; i++) {
    //         swapped = false;
    //         for (j = 0; j < n - i - 1; j++) {
    //             if (arr[j] > arr[j + 1]) {
                      
    //                 temp = arr[j];
    //                 arr[j] = arr[j + 1];
    //                 arr[j + 1] = temp;
    //                 swapped = true;
    //             }
    //         }
    //         if (swapped == false)
    //             break;
    // }

    int lo = 0;
    int hi = arr.length-1;
    int mid = 0;

    while(mid <= hi){
        if(arr[mid] == 0){
            swap(arr,lo,mid);
            lo++;
            mid++;
        }else if(arr[mid] == 1){
            mid++;
        }else{
            swap(arr,mid,hi);
            hi--;
        }
    }
  }
  public static void swap(int arr[],int i,int j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
  }
}