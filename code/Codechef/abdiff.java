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
        int a = scn.nextInt();
        int b = scn.nextInt();
        int sum = a + b;
        int chefans = a * b;

        if(chefans > sum){
            System.out.println(chefans - sum);
        }else if(sum > chefans){
            System.out.println(sum - chefans);
        }else if(chefans == sum){
            System.out.println("0");
        }
	}
}

