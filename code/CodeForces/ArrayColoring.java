import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while(t-- > 0){
            int n = scn.nextInt();
            int m = scn.nextInt();

            long ts_sum = 0;
            int ts[] = new int[n];
            for(int i=0;i<n;i++){
                ts[i] = scn.nextInt();
                ts_sum += ts[i];
            }

            long te_sum = 0;
            int te[] = new int[m];
            for(int i=0;i<m;i++){
                te[i] = scn.nextInt();
                te_sum += te[i];
            }
            if(ts_sum > te_sum){
                System.out.println("Tsondu");
            }else if(te_sum > ts_sum){
                System.out.println("Tenzing");
            }else{
                System.out.println("Draw");
            }
        }
    }
}