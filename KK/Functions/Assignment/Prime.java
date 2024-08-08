package Assignment;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check prime from :: ");
        int n = in.nextInt();
        System.out.println();
        System.out.print("Till ? -->");
        int n_2=in.nextInt();
        in.close();
        primetill(n,n_2);
    


    }

    public static void primetill(int n, int n_2) {

        for (int i = 2; i <= n_2; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int i) {
        if (i <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int j = 2; j <= Math.sqrt(i); j++) {

            if (i % j == 0){
                return false;
            }
        }
        return true;
            
    }
}
