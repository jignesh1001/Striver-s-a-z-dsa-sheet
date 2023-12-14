/**
 * ReverseAnArray
 */
public class ReverseAnArray {
    public static void printArray(int arr[]){
        for(int i = 0;i<=arr.length -1 ;i++){
            System.out.println(arr[i]);
        }
    }
    public static void reverse(int arr[],int n){
        int rarr [] = new int[n];
        for(int i = n -1;i>=0;i--){
            rarr[n-1-i] = arr[i];
        }
        printArray(rarr);
    }
    public static void reverseUsingSwapping(int arr[],int n){
        
            int start  = 0;
            int end = arr.length -1;
            while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
                }
            
            printArray(arr);
        
    }
    public static void main(String args[]){
        int size = 5;
        int arr1[] = {1,2,3,4,5,6};
        // reverse(arr1,size);
        reverseUsingSwapping(arr1, size);
    }
}