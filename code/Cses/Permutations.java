import java.util.*;

 class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if(n == 2 || n == 3){
            System.out.print("NO SOLUTION");
            return;
        }
       StringBuilder sb = new StringBuilder();
       int count = 2;
       while(count <= n){
        sb.append(count + " ");
        count += 2;
       }
       count = 1;
       while(count <= n){
        sb.append(count + " ");
        count += 2;
       }
       System.out.println(sb);
    }
}