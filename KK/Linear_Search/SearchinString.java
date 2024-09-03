package Linear_Search;

import java.util.Scanner;

public class SearchinString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String searchar = in.nextLine();

        if (searchar.length() > 0) {
            if (search(str,  searchar.charAt(0))){
                System.out.println("Character found");
            }
        } else {
            System.out.println("Search string is empty");
        }

        



        in.close();
    }
    
    public static boolean search(String str, char target){
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
            
        }
        return false;
    }
    
}
