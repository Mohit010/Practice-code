import java.util.*;

class Main {

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            array[i] = arr[i];
        }

        int count = 0;
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != array[i] % 2) {
                count++;
                break;
            }
        }

        if (count == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            solve();
        }
    }
}
