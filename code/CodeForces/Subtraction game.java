import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();

    while (t-- > 0) {
      int a = scn.nextInt();
      int b = scn.nextInt();

      if (a != 1 && b != 1) {
        System.out.println(Math.min(a, b) - 1);
      } else if ((a + b) == 3) {
        System.out.println("3");
      } else if (a == 1 || b == 1) {
        System.out.println("2");
      }
      //System.out.println(a + b); ... another solution.
    }
  }
}