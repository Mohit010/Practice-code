import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // consume the newline character after reading t
        while (t-- > 0) {
            String s = scanner.nextLine();
            s = s.substring(0, s.length() / 2);
            int k = (int) s.chars().distinct().count();
            System.out.println(k == 1 ? "NO" : "YES");
        }
        scanner.close();
    }
}
