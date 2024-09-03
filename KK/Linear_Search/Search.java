package Linear_Search;

public class Search{
    public static void main(String[] args) {
        int[] arr = {12,23,45,56,67,87,78,89};
        int target = 45;
        boolean flag = false;
        for (int i=0 ; i<arr.length; i++){
            if (arr[i] == target){
                System.out.println("Element is present at index " + i);
                flag = true;
        }}
        if (!flag){
            System.out.println("Sorry! Element not present.");
    

        }}}
