package BinarySearch;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            { 1, 2, 3, 4, 5},
            {11,22,33,44,55},
            {14,24,34,44,54},
            {19,29,39,49,59}
        };
        
    }
    public static int[] rowColSearch(int[][] arr,int x){
        int row = 0;
        int col = arr.length-1;
        while (row < arr.length && col>=0){
            if(arr[row][col] == x){
                return new int[] {row,col};
            }
            if( arr[row][col]>x){
                row++;
            }
            else{col--;}
        } 
        
        return new int[] {-1,-1};
    }
    
}
