package Assignment;

import java.util.Scanner;

public class SumN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int i = in.nextInt();
        in.close();
        sum(i);
    }

    public static void sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n;i++){
            sum += i;
        }
        System.out.println("sum till N number is :: " + sum);
    }
}
