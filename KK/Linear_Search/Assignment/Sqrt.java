package Linear_Search.Assignment;

import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a non-negative integer: ");
        int x = scanner.nextInt();
        
        int sqrt = mySqrt(x);
        
        System.out.println("The square root of " + x + " rounded down is: " + sqrt);
        
        scanner.close();
    }
    
    public static int mySqrt(int x) {
        if (x == 0) return 0;
        
        int left = 1, right = x;
        int result = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (mid <= x / mid) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return result;
    }
    
}
