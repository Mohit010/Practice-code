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

            Arrays.sort(arr);
            int i = 0;
            int j = n-1;
            int ans = 0;

            while(i < j){
                int diff = arr[j] - arr[i];
                ans += diff;
                i++;
                j--;
            }
            System.out.println(ans);
        }
    }
}