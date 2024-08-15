package Arrays.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class ZeroBasedArray{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the lenght of array :: ");
        int k = in.nextInt();
        int[] array= new int[k];
        for (int j = 0; j < k; j++) {
            System.out.print("Enter the element at index " + j + " :: ");
            array[j] = in.nextInt();
            
        }
        int[] ans = new int[5];
        array = new int[]{0,2,1,4,3};
        for (int i = 0; i < array.length; i++) {
            ans[i] = array[array[i]];

        }
        System.out.print("Array you entered :: ");
        System.out.println(Arrays.toString(array));
        System.out.print("Actual array :: ");
        System.out.println(Arrays.toString(ans));
        in.close();
    }
}