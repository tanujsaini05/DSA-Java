package Arrays.Assignment;

import java.util.Scanner;
import java.util.Arrays;
public class RunningSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the lenght of array :: ");

        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element at index " + i + " :: ");
            arr[i] = in.nextInt();
        }

        System.out.println("Array you entered :: "+Arrays.toString(arr));

        int[] runningSum = new int[n];
        int sum = 0;
        for (int j = 0; j < runningSum.length; j++) {
            sum += arr[j];
            runningSum[j] = sum;
        }

        System.out.println("Running sum array :: "+Arrays.toString(runningSum));

        in.close();
    }
}
