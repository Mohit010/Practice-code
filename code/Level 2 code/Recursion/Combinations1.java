import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ritems = scn.nextInt();
        combinations(1,n,0,ritems,"");
    }
    public static void combinations(int cb,int tb,int ssf,int ts,String asf){
        
        if(cb > tb){
            if(ssf == ts){
                System.out.println(asf);
            }
            return;
        }

        combinations(cb+1,tb,ssf+1,ts,asf+"i");
        combinations(cb+1,tb,ssf,ts,asf+"-");
    }
}
