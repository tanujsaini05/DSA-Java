import java.util.Scanner;

/**
 * Functions
 */
public class Functions {

    public static void main(String[] args) {
        System.out.print("Enter a number :: ");
        Scanner in=new Scanner(System.in);
        int one=in.nextInt();
        System.out.print("Enter the another number :: ");
        int two = in.nextInt();
        in.close();
        sum(one,two);
    }

    static void sum(int a,int b){
        int sum = a + b;
        System.out.println(sum);
    }
}