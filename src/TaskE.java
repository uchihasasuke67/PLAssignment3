import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int sum = 0;

        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }

        System.out.println(sum);
    }
}
