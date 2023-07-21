import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int a, b;
            int ans = 0;
            int maxm = 0;
            int bx = 0;

            for (int i = 0; i < n; i++) {
                a = scanner.nextInt();
                b = scanner.nextInt();
                if (a <= 10) {
                    ans = b;
                }
                if (ans > maxm) {
                    bx = i + 1;
                    maxm = ans;
                }
            }
            System.out.println(bx);
        }

        scanner.close();
    }
}

