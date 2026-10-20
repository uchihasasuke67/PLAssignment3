import java.util.Scanner;

public class TaskG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        for (int divisor = 2; divisor <= x; divisor++) {
            if (x % divisor == 0) {
                System.out.println(divisor);
                break;
            }
        }
    }
}