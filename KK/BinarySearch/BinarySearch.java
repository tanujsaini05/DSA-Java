package BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        //int[] arr = new int[10];
    int[] arr = {-12,-10,-5,-2,4,8,10,12,16,20};
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number to search : ");
    int n = in.nextInt();
    System.out.println(binsearch(arr,n));
    in.close();
    }
    public static int binsearch(int[] arr,int x){
        int start = 0;
        int end = arr.length - 1;
        
        while (start<=end) {
            int mid =  start + (end-start) / 2;
            if (arr[mid] < x) {
                start = mid +1;
            }else if (arr[mid] > x) {
                end = mid-1;
            }
            else{return mid;}
        
        }
        return -1;
    }   
}
