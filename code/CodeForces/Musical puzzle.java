import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);

      int t = scn.nextInt();
      while(t-- > 0){
        int n = scn.nextInt();
        String s = scn.next();

        HashSet<String>hs = new HashSet<>();
        int count = 0;
        for(int i=0;i<n-1;i++){
          // System.out.println("count0");
            // System.out.println("count1");
            String str = s.substring(i,i+2);
            if(hs.contains(str) == false){
              hs.add(str);
              // System.out.println(str);
              count++;
            }
        }
        System.out.println(count);
        
      }
  }
}
