import java.util.*;

public class Main{
  public static void main(String args[]){

      Scanner scn = new Scanner(System.in);
      int t = scn.nextInt();

      while(t-- > 0){
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
          arr[i] = scn.nextInt();
        }

        int count = 0;
        for(int i=0;i<n;i++){
          if(arr[i] < 0){
            System.out.println(arr[i]);
            count++;
            break;
          }
        }
        if(count == 0){
          int max = Integer.MIN_VALUE;
          for(int i=0;i<n;i++){ 
            if(arr[i] > max){
              max = arr[i];
            }
          }
          System.out.println(max);
        }
      }
  }
}