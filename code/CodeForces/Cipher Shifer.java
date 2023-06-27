import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
        while(t-- > 0){
            int n = scn.nextInt();
            String str = scn.next();
           
            char[] arr = str.toCharArray();
            char[] ans = new char[n];

            int i=0;
            int j = i+1;
            int k = 0;
            while(j < arr.length){
                if(arr[i] != arr[j]){
                    j++;
                }else{
                    ans[k] = arr[i];

                    if(i < arr.length && j < arr.length){
                        i = j+1;
                        j = i+1;
                        k++;
                    }
                }
            }
            String fans = "";
            for(int a=0;a<ans.length;a++){
              fans += ans[a];
            }
            
            System.out.println(fans.trim());
        }

    }
}