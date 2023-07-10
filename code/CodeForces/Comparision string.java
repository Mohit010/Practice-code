import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();

    while(t-- > 0){
      int n = scn.nextInt();
      String s = scn.next();

      int curr = 1;
      int ans = 1;

      for(int i=1;i<n;i++){
        if(s.charAt(i) != s.charAt(i-1)){
          curr = 1;
        }else{
          curr++;
        }
        ans = Math.max(curr,ans);
      }
      System.out.println(ans+1);

    }
  }
}