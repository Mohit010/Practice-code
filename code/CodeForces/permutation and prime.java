import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            for (int i = 3; i <= n; i++) {
                if (i % 2 == 1)
                    System.out.print(i + " ");
            }
            System.out.print(1 + " ");
            for (int i = n; i >= 2; i--) {
                if (i % 2 == 0)
                    System.out.print(i + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
