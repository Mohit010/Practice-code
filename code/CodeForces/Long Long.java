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

            long sum = 0;
            int count = 0;
            boolean bool = false;
            for(int i=0;i<n;i++){

                sum += Math.abs(arr[i]);
                if(arr[i] < 0 && bool == false){
                    bool = true;
                    count++;
                }
                if(arr[i] > 0){
                    bool = false;
                }
            }
            System.out.print(sum + " " + count);
            System.out.println();
        }
    }
}