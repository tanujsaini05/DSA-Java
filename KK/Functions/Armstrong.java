import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number :: ");
        int num = in.nextInt();
        in.close(); // Close the scanner when done
        arm(num);
    }

    static void arm(int a) {
        int n = a;
        int sum = 0;
        int digits = String.valueOf(a).length();

        for (int i = 0; i < digits; i++) {
            int r = a % 10;
            sum += Math.pow(r, 3);
            a /= 10; // Update a by removing the last digit
        }

        if (sum == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}
