import java.util.Scanner;

public class Main {

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int p = scanner.nextInt();
            if (p == a) {
                count++;
            }
            a++;
        }

        if (count != 0) {
            if (count % 2 == 0) {
                System.out.println(count / 2);
            } else {
                System.out.println((count + 1) / 2);
            }
        } else {
            System.out.println(0);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            solve();
        }
    }
}
