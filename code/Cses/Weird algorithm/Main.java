
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        
        while(n!=1){
            if(n % 2 == 0){
                System.out.println(n);
                n = n/2;
            }else{
                System.out.println(n);
                n = 3*n + 1;
            }
        }
        System.out.println(1);
    }
}