package BinarySearch;

public class OrderAgnosticBS {
    
    public static void main(String[] args) {
        
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
