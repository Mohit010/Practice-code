import java.util.Scanner;

public class Main {

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int lo = 1;
        int hi = (int) 1e9;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += (a[i] + (2 * mid)) * (a[i] + (2 * mid));
                if (sum > c) break;
            }
            if (sum > c) hi = mid - 1;
            else if (sum < c) lo = mid + 1;
            else {
                System.out.println(mid);
                return;
            }
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
