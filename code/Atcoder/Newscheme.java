import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        
        int arr[] = new int[8];

        for(int i=0;i<8;i++){
            arr[i] = scn.nextInt();
        }

        int count = 0;
        for(int i=0;i<8;i++){
            if(arr[i] < 100 || arr[i] > 675){
                count++;
            }
            if(arr[i] % 25 != 0){
                count++;
            }
        }
        for(int i=1;i<8;i++){
            if(arr[i] < arr[i-1]){
                count++;
            }
        }

            if(count == 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
