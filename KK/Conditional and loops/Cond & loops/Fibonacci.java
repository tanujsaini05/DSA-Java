import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int num = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        
        while (count<=num){
            int temp = a+b;
            a=b;
            b=temp;
            System.out.print(temp+" ");
            count += 1;

        }
    }
}
