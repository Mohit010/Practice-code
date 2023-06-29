import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // n = 1000000

        sieve(n);
    }
    public static void sieve(int n){
        int isPrime[] = new int[1000001];

        int maxN = 1000000;

        for(int i=1;i<maxN;i++){
            isPrime[i] = 1;
        }
        isPrime[0] = 0;
        isPrime[1] = 0;

        for(int i=2;i*i <= maxN;i++){
            if(isPrime[i] == 1){
                for(int j=i*i; j <= maxN; j += i){
                    isPrime[j] = 0;
                }
            }
        }
    }
}