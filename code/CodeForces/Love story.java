import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while(t-- > 0){
            String input = scn.next();
            String cf = "codeforces";

            int count = 0;
            for(int i=0;i<input.length();i++){
                if(input.charAt(i) != cf.charAt(i)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}