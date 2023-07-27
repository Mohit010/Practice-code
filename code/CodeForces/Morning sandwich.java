import java.util.Scanner;

public class Main {
    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int h = scanner.nextInt();

        if ((c + h) >= (b - 1)) {
            System.out.println((2 * b) - 1);
        } else if ((c + h) < (b - 1)) {
            System.out.println((2 * (c + h)) + 1);
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

