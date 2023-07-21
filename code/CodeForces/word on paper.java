import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0) {
            char ans = '0';
            char[][] arr = new char[8][8];

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    arr[i][j] = scanner.next().charAt(0);
                    if (arr[i][j] != '.') {
                        ans = arr[i][j];
                        System.out.print(ans);
                    }
                }
            }

            System.out.println();

            // Perform any other operations for each test case here

        }

        scanner.close();
    }
}
