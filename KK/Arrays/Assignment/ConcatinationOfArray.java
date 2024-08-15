package Arrays.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatinationOfArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the lenght :: ");

        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the "+i+"th elemnt :: ");
            arr[i] = in.nextInt();
        }
        System.out.print("Array you Entered :: "+Arrays.toString(arr));
        int k=0;
        int[] nums = new int[2*n];
        for (int j = 0; j < arr.length; j++) {
            
        }

        in.close();
    }
}
