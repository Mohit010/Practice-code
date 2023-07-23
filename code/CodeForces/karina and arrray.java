import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for (int testCase = 0; testCase < t; testCase++) {
            int n = scn.nextInt();
            List<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(scn.nextInt());
            }
            Collections.sort(a);

            int maxProduct = Math.max(a.get(0) * a.get(1), a.get(n - 1) * a.get(n - 2));
            System.out.println(maxProduct);
        }
    }
}

