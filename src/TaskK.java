import java.util.Scanner;

public class TaskK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        StringBuilder result = new StringBuilder();

        for (int divisor = 1; divisor <= x; divisor++) {
            if (x % divisor == 0) {
                if (result.length() > 0) {
                    result.append(' ');
                }
                result.append(divisor);
            }
        }

        System.out.println(result);
    }
}
