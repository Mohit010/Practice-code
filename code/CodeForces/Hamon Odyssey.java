import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // Redirecting input/output to files if needed
        File inputFile = new File("input1.txt");
        File outputFile = new File("/Users/sreejith/Desktop/output.txt");
        Scanner scanner = new Scanner(inputFile);
        PrintStream output = new PrintStream(outputFile);
        // Comment the above lines and use standard input/output during actual execution

        int t = scanner.nextInt();
        while (t-- > 0) {
            long n, sum, cnt = 0;
            n = scanner.nextLong();
            Vector<Long> v = new Vector<>();
            for (long i = 0; i < n; i++) {
                v.add(scanner.nextLong());
            }

            if (n == 1) {
                output.println(1);
                continue;
            }

            sum = v.get(0);
            for (long i = 0; i < n; i++) {
                sum &= v.get((int) i);
                if (sum == 0) {
                    cnt++;
                    sum = (i + 1 < n ? v.get((int) (i + 1)) : 0);
                }
            }
            if (cnt == 0) {
                cnt = 1;
            }
            output.println(cnt);
        }

        // Closing the input/output streams if used
        scanner.close();
        output.close();
    }
}

