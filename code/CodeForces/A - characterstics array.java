import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();

    while(t-- > 0){
      int n = scn.nextInt();
      int k = scn.nextInt();

      int x = -1;
      for(int i=0;i<=n;i++){
        if((i*(i-1)) / 2 + ((n-i) * (n-i-1)) / 2 == k){
            x = i;
        }
      }
      if(x == -1){
        System.out.println("No");
      }else{
        System.out.println("Yes");
        for(int i=0;i<n;i++){
           if(i < x){
            System.out.print("1" + " ");
           }else{
            System.out.print("-1" + " ");
           }
        }
      }
    }
  }
}
