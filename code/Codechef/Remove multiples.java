/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while(t-- > 0){
            long n = scn.nextLong();
            int m = scn.nextInt();

            long sum = (n)*(n+1)/2;
            for(int i=0;i<m;i++){
                long a = scn.nextInt();
                sum = sum - a;
            }
            System.out.println(sum);
        }
	}
}

