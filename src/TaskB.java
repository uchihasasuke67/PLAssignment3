import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        StringBuilder result = new StringBuilder();

        for (int number = a; number <= b; number++) {
            if (number % d == c) {
                if (result.length() > 0) {
                    result.append(' ');
                }
                result.append(number);
            }

            if (number == Integer.MAX_VALUE) {
                break;
            }
        }

        System.out.print(result);
    }
}
