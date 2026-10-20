import java.util.Scanner;

public class TaskO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean hasZero = false;

        for (int i = 0; i < n; i++) {
            if (scanner.nextInt() == 0) {
                hasZero = true;
            }
        }

        System.out.println(hasZero ? "YES" : "NO");
    }
}
