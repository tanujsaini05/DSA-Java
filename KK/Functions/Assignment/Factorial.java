package Assignment;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number :: ");
        int x=in.nextInt();
        in.close();
        fact(x);
    }

    private static void fact(int x) {
        int fact = 1;
        for (int i=1;i<x+1;i++){
            fact = fact * i;
        }
        System.out.println("Factorial of "+x+" is :: "+fact);
    }
}
