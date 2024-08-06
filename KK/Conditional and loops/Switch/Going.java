import java.util.Scanner;

public class Going {
    public static void main(String[] args) {
        System.out.println("Hi! you are just allowed to go out on even days.");
        System.out.print("Please enter the day :: ");
        Scanner in = new Scanner(System.in);

        int choice = in.nextInt();
        if (choice % 2 == 0){
            System.out.println("You are allowed to go out.");
        }
        else System.out.println("Please stay inside the home😢");

    }
}
