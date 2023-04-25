// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         // System.out.println("Hello, World!");
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
        
//        while(n > 1){
//            if(n %2 == 0){
//                System.out.print(n + " ");
//                n = n /2;
//            }else{
//                System.out.print(n + " ");
//                n = (n*3) + 1;
//            }
           
//        }
//        System.out.print(1);
        
        
//             }
//         }

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// import java.util.*;
// public class Main
// {
// 	public static void main(String[] args) {
// // 		System.out.println("Hello World");
//        Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int arr[] = new int[n-1];
        
//         int Tsum = n*(n+1)/2;
//         int Arsum = 0;
        
//         for(int i=0;i<n-1;i++){
//             arr[i] = scn.nextInt();
//             Arsum = Arsum + arr[i];
//         }
//         int ans = Tsum - Arsum;
//         System.out.println(ans);
//         // System.out.println("ans");
// 	}
// }

// import java.util.*;

// class HelloWorld {
//     public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);
//       int n=sc.nextInt();
//       int arr[]=new int[n-1];
//       int tsum=((n)*(n+1))/2;
//       int arsum=0;
      
//       for(int i=0;i<n-1;i++)
//       {
//          arr[i]=sc.nextInt();
//          arsum=arsum+arr[i];
//       }
      
//       int ans=tsum-arsum;
//       System.out.println(ans);
//     }
// }

// import java.util.*;
// public class Main
// {
// 	public static void main(String[] args) {

//        Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int arr[] = new int[n-1];
//         int freq[] = new int[n];
        
        
        
//         for(int i=1;i<=n;i++){
//             arr[i] = scn.nextInt();
//             freq[arr[i]] = 1;
//         }
//         for(int i=1;i<=n;i++){
//             if(freq[i] == 0){
//                 System.out.print(i);
//                 break;
//             }
//         }
// 	}
// }

import java.util.*;
public class Main
{
	public static void main(String[] args) {

       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n-1];
        int freq[] = new int[n+1];
        
        
        
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
            freq[arr[i]] = 1;
        }
        for(int i=1;i<=n;i++){
            if(freq[i] == 0){
                System.out.print(i);
                break;
            }
        }
	}
}

