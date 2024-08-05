import java.util.Scanner;

public class Countnum {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the number in which you will look :: ");
        int n = in.nextInt();
        System.out.print("Number you want to se occurences :: ");
        int occur = in.nextInt();
        int count = 0;
        while (n>0){
            n=n/10;
            int rem=n%10;
            if (rem == occur){
                count++;
            }
        }
        System.out.println("The number "+occur+" occurs "+count+" times");
    }
}
