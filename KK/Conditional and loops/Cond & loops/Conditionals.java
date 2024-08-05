import java.util.Scanner;

public class Conditionals{
    public static void main(String[] args) {
        //int in;
        Scanner in=new Scanner(System.in);

        System.out.println("Enter 1st No.");
        int a = in.nextInt();
        System.out.println("Enter 2nd No.");
        int b = in.nextInt();
        System.out.println("Enter 3rd No.");
        int c = in.nextInt();
        int max=a;
        if (b>max){
            max=b;
        }
        if (c>max){
            max=c;
        }
        System.out.println("Greatest No. is " + max);

    }
}