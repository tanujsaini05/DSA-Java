package Linear_Search;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {12,11,22,-34,90,87,67,54,45,23,32};
        int target = 22;
        int start = 1;
        int end = 5;
        linearSearch(arr, target,start,end);
    }

    public static void linearSearch(int[] arr,int target,int start,int end){
        boolean flag = false;
        for (int i = start; i< end; i++) {
            if(arr[i]==target){
                flag = true;
                System.out.println("Element found at "+i+"th index");    
            }  

        }

        
        if(!flag){
        System.out.println("Sorry! didn't found your element you are looking for.");}

    }
}
