import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();

    while (t-- > 0) {
      int n = scn.nextInt();
      int min0 = Integer.MAX_VALUE;
      int min1 = Integer.MAX_VALUE;
      int min2 = Integer.MAX_VALUE;

      
      for(int i=0;i<n;i++){
        int m = scn.nextInt();
        String s = scn.next();

        if(s.charAt(0) == '1' && s.charAt(1) == '1' && m < min2){
              min2 = m;
        }
        if(s.charAt(0) == '1' && m < min0){
              min0 = m;
        }
        if(s.charAt(1) == '1' && m < min1){
              min1 = m;
        }
      }
       if(min0 == Integer.MAX_VALUE || min1 == Integer.MAX_VALUE){
          System.out.println("-1");
       }else{
        int ans1 = (min0 + min1);
        System.out.println(Math.min(min2,ans1));
       }

    }
  }
}