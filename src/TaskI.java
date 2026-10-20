import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int count = 0;

        for (int divisor = 1; divisor <= x; divisor++) {
            if (x % divisor == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
