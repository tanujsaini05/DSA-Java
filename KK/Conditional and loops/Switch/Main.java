import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.print("Hello Can you please enter a fruit :: ");
        //String fruit = in.next();
        
        // switch (fruit){
        //     case ("Mango"):{
        //         System.out.println("King of fruits");
        //         break;
        //     }
        //     case ("Apple"):{
        //         System.out.println("An apple a day keeps the doctor away.");
        //         break;
        //     }
        //     default:{
        //         System.out.println("Please enter a valid fruit");
        //     }
        // }
System.out.print("Please enter a day between 1-7 :: ");
int day = in.nextInt();

        switch (day) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:{
        System.out.println("Weekday");
        break;
        }
        case 6:
        case 7:{
            System.out.println("Weekend");
            break;
        }

            default: System.out.println("please enter a day between 1-7 ");

                
        }
    }
}