import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = in.nextLine();
        String temp = str;
        String rev = "";
        int len = str.length();
        for(int i =len-1; i>=0;--i){
            rev = rev + str.charAt(i);

        }
        if (str.toLowerCase().equals(rev.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
          }
          else {
            System.out.println(str + " is not a Palindrome String.");
    }}
}
