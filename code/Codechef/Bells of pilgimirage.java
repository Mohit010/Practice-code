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
            int n = scn.nextInt();
            int x = scn.nextInt();
            int k = scn.nextInt();
            int p = scn.nextInt();

            int count = 0;
            while(count < k){
                if(count < x){
                    p += 10;
                    count++;
                }else{
                    p += 5;
                    count++;
                }
            }
            if(k == n){
                p += 20;
            }
            System.out.println(p);
        }
	}
}

