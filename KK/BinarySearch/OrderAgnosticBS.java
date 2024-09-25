package BinarySearch;

import java.util.Scanner;

public class OrderAgnosticBS {
    
    public static void main(String[] args) {
    int[] arr = {-12,-10,-5,-2,4,8,10,12,16,20};
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number to search : ");
    int n = in.nextInt();
    System.out.println(OrderAgnosticBinaryS(arr,n));
    in.close();
        
    }
    static int OrderAgnosticBinaryS( int[] arr, int x){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start]< arr[end];
        while (start<=end) {
            int mid =  start + (end-start) / 2;
            if (isAsc){
                if (arr[mid] < x) {
                    start = mid +1;
                }else if (arr[mid] > x) {
                    end = mid-1;
                }
                else{return mid;}
            }
            else{
                if (arr[mid] > x) {
                    start = mid +1;
                }else if (arr[mid] < x) {
                    end = mid-1;
                }
                else{return mid;}
            }
        
        }
        return -1;
    }
}
