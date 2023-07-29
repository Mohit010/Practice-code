import java.util.Scanner;

public class Main {

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = 1;
        int length = 0;
        int m = 0;
        while (l <= 50) {
            if (n % l == 0) {
                length++;
            } else {
                length = 0;
            }
            l++;
            m = Math.max(length, m);
        }

        System.out.println(m);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            solve();
        }
    }
}

