import java.util.Scanner;

public class TaskP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();

        StringBuilder result = new StringBuilder();

        for (int x = 0; x <= 1000; x++) {
            long value = a * x * x * x + b * x * x + c * x + d;

            if (value == 0) {
                if (result.length() > 0) {
                    result.append(' ');
                }
                result.append(x);
            }
        }

        System.out.print(result);
    }
}
