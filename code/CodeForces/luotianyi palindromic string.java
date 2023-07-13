import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();

    while(t-- > 0){
      String s = scn.next();
      int count = 0;

       if(s.length() == 1){
        System.out.println("-1");
       }else{
            for(int i=0;i<s.length()-1;i++){
          if(s.charAt(i) != s.charAt(i+1)){
              count++;
          }
        }
          if(count == 0){
            System.out.println("-1");
          }else{
            System.out.println(s.length() - 1);
          }
       }
    }
  }
}
