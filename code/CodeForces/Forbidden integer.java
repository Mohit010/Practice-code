import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
        while(t-- > 0){
            int n = scn.nextInt();
            int k = scn.nextInt();
            int x = scn.nextInt();

            if(x != 1){
                System.out.println("Yes");
                System.out.println(n);
                for(int i=0;i<n;i++){
                    System.out.print(1 + " ");
                }
                System.out.println();
            }else if(k == 1){
                System.out.println("No");
                System.out.println();
            }else if(k == 2){
                if(n % 2 == 0){
                    System.out.println("Yes");
                    int a = n / 2;
                    System.out.println(a);
                    for(int i=0;i<a;i++){
                        System.out.print(2 + " ");
                    }
                    System.out.println();
                }else{
                    System.out.println("No");
                    System.out.println();
                }
            }else{
                if(n % 2 == 0){
                   System.out.println("Yes");
                   int b = n / 2;
                   System.out.println(b);
                   for(int i=0;i<b;i++){
                     System.out.print(2 + " ");
                   }
                   System.out.println();
                }else {
                    System.out.println("Yes");
                    System.out.println(n/2);
                    int c = (n/2) - 1;
                    for(int i=0;i<c;i++){
                        System.out.print(2 + " ");
                    }
                    System.out.print(3);
                    System.out.println();
                }
            }
        }
    }
}
