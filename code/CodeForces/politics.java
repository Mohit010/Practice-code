import java.util.*;

public class Main{
  public static void main(String args[]){
      Scanner scn = new Scanner(System.in);
      int t = scn.nextInt();

      while(t-- > 0){
        int n = scn.nextInt();
        int k = scn.nextInt();
        int ans = n;

        String[] s = new String[n];
        for(int i=0;i<n;i++){
          s[i] = scn.next();
          if(!s[i].equals(s[0])){
            ans--;
          }
        }
        System.out.println(ans);
      }
  }
}
