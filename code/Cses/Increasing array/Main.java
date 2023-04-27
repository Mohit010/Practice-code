import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long arr[] = new long[n];
        
        for(int i=0;i<n;i++){
            arr[i] = scn.nextLong();
        }
        long count = 0;
        for(int i=1;i<n;i++){
            if(arr[i] < arr[i-1]){
                long diff = arr[i-1] - arr[i];
                count = count + diff;
                arr[i] = arr[i] + diff;
            }
        }
        System.out.println(count);
    }
}