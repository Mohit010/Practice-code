import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while(t-- > 0){
            int n = scn.nextInt();
            int arr[] = new int[n];
            int count = 0;
            for(int i=0;i<n;i++){
                arr[i] = scn.nextInt();
                if(arr[i] == 0){
                    count++;
                }
            }
            int i=0;
            int j=0;
            int ans = 0;
            int length = 0;
            if(count == n){
                ans = n;
            }else{
                if(n == 1 && arr[0] == 0){
                ans = 1;
            }else{
                while(j < n){
                  if(arr[i] == 0 && arr[j] == 0){
                    length = j - i + 1;
                    j++;
                  }else if(arr[i] != 0 && arr[j] != 0){
                    i++;
                    j++;
                  }else if(arr[j] != 0){
                    i = j + 1;
                    j++;
                  }

                if(length > ans){
                    ans = length;
                }
              }
            }
            }

            System.out.println(ans);
        }
    }
}
