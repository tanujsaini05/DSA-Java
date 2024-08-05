import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        char str=in.next().trim().charAt(0);
         if (str>='a' && str<= 'z'){
            System.out.println("LowerCase");
         }else{
            System.out.println("UpperCase");
         }


    }
}
