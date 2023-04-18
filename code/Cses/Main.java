// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
       while(n > 1){
           if(n %2 == 0){
               System.out.print(n + " ");
               n = n /2;
           }else{
               System.out.print(n + " ");
               n = (n*3) + 1;
           }
           
       }
       System.out.print(1);
        
        
            }
        }
