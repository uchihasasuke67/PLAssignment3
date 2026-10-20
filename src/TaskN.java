


import java.util.Scanner;

public class TaskN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int zero = 0, positive = 0, negative = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 0) {
                zero++;
            } else if (x > 0) {
                positive++;
            } else {
                negative++;
            }
        }

        System.out.println(zero + " " + positive + " " + negative);
    }
}
