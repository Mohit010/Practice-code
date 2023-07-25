import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();

    while (t-- > 0) {
      int n = scn.nextInt();
      int m = scn.nextInt();
      int k = scn.nextInt();
      int h = scn.nextInt();
      int count = 0;

      for (int i = 0; i < n; i++) {
        int a = scn.nextInt();
        int diff = (int) Math.abs(h - a);
        if (diff % k == 0 && diff / k < m && a != h) {
          count++;
        }
      }
      System.out.println(count);

    }
  }
}
