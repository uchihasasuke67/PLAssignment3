import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        StringBuilder result = new StringBuilder();

        for (long number = 0; number * number <= b; number++) {
            long square = number * number;
            if (square >= a) {
                if (result.length() > 0) {
                    result.append(' ');
                }
                result.append(square);
            }
        }

        System.out.print(result);
    }
}
