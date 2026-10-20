import java.util.Scanner;

public class TaskS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        StringBuilder result = new StringBuilder();
        int value = 1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (i > 0) {
                result.append(' ');
            }
            result.append(value);

            count++;
            if (count == value) {
                value++;
                count = 0;
            }
        }

        System.out.println(result);
    }
}
