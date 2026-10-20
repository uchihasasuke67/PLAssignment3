import java.util.Scanner;

public class TaskN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int zeros = 0;
        int positives = 0;
        int negatives = 0;

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number == 0) {
                zeros++;
            } else if (number > 0) {
                positives++;
            } else {
                negatives++;
            }
        }

        System.out.println(zeros + " " + positives + " " + negatives);
        scanner.close();
    }
}