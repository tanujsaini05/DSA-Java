package Arrays;

import java.util.Scanner;

public class ColNoFIx {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        Scanner in = new Scanner(System.in);
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        in.close();
    }
}
