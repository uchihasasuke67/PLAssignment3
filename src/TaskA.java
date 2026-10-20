import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        StringBuilder result = new StringBuilder();

        int current = a;
        if (current % 2 != 0) {
            // Если a — максимальное целое число, подходящих чисел нет.
            if (current == Integer.MAX_VALUE) {
                System.out.println();
                return;
            }
            current++;
        }

        while (current <= b) {
            if (result.length() > 0) {
                result.append(' ');
            }
            result.append(current);

            // Не допускаем переполнения при прибавлении 2.
            if (current == b || current == b - 1) {
                break;
            }
            current += 2;
        }

        System.out.println(result);
    }
}
