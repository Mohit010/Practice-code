
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        
        int count = 1;
        int max = 1;
        
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }else{
                count = 1;
            }
            max = Math.max(max,count);
        }
        System.out.print(max);
    }
}