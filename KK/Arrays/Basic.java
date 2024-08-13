package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        // simplest way to declare an array
        // int[] arr=new int[5];
        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 30;
        // arr[3] = 40;
        // arr[4] = 50;
        // System.out.println(Arrays.toString(arr));

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the array length :: ");
        int n= in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<=n-1; i++){
            System.out.print("Enter the "+(i+1)+"th element :: ");
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}



