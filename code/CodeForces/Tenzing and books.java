import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int[] a = new int[100000];
            int s = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < n; j++) {
                    a[j] = scanner.nextInt();
                }
                for (int j = 0; j < n; j++) {
                    if ((x | a[j]) != x) {
                        break;
                    }
                    s |= a[j];
                }
            }
            if (s == x) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
