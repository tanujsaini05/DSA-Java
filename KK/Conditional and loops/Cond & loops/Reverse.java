import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number :: ");
        int num=in.nextInt();
        int temp=num;
        int rev=0;
        while (num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("Reverse of "+temp+" is "+rev);
    }
}
