import java.util.Scanner;

public class TaskL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String binary = scanner.next();

        int decimal = Integer.parseInt(binary, 2);

        System.out.println(decimal);
    }
}