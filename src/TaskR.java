import java.util.Scanner;

public class TaskR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        int count = 0;

        for (int x = 0; x <= 1000; x++) {
            if (x != e && a * x * x * x + b * x * x + c * x + d == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
