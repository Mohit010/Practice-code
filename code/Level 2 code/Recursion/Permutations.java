import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int boxes[] = new int[n];
        int ti = scn.nextInt();
        permutations(boxes,1,ti);
    }
    public static void permutations(int boxes[],int ci,int ti){

        if(ci > ti){
            for(int i=0;i<boxes.length;i++){
                System.out.print(boxes[i]);
            }
            System.out.println();
            return;
        }

        for(int b=0;b<boxes.length;b++){
            if(boxes[b] == 0){
                boxes[b] = ci;
                permutations(boxes,ci+1,ti);
                boxes[b] = 0;
            }
        }
    }
}
