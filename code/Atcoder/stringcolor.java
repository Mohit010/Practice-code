import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int m = scn.nextInt();

         String c[] = new String[n];
         for(int i=0;i<c.length;i++){
            c[i] = scn.next();
         }

         String d[] = new String[m];
         for(int i=0;i<d.length;i++){
            d[i] = scn.next();
         }

         int parr[] = new int[m+1];
           for(int i=0;i<parr.length;i++){
                parr[i] = scn.nextInt();
           }
           int ans = 0;
           for(int i=0;i<c.length;i++){
                int index = find(c[i] ,d);
                ans += parr[index];
           }
           System.out.println(ans);

        }
        public static int find(String c,String d[]){
            for(int i=0;i<d.length;i++){
                String ci = d[i];
                if(c.equals(ci) == true){
                    return i+1;
                }
            }
            return 0;
            
        }
    }
