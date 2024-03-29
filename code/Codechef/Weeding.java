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
            int m = scn.nextInt();
            int k = scn.nextInt();
            int count = 0;

            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = scn.nextInt();
            }

            for(int i=0;i<n;i++){
                arr[i] += k;
            }

            for(int i=0;i<n;i++){
                if(arr[i] > m+1){
                    System.out.println("No");
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println("Yes");
            }
        }
	}
}

