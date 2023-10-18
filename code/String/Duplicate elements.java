import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        int n = arr.length;
        int count = 1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                count++;
            }else{
                System.out.println(arr[i] + " " + count);
                count = 1;
            }
        }
        if(count != 1){
            System.out.println(arr[n-1] + " " + count);
        }else{
            System.out.println(arr[n-1] + " " + 1);
        }
        
        
    }
}
