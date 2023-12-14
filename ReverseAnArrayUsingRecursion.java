public class ReverseAnArrayUsingRecursion {
    public static void printArray(int arr[],int n){
      for(int x:arr){
        System.out.print(x + " ");
      }
    }
    public static void reverse(int arr[],int start,int end){
      if(start<end){
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
        reverse(arr, start+ 1, end- 1);
      }
      
    }
    public static void main(String args[]){
       int n = 3;
       int arr1[] = {1,2,4};
      reverse(arr1, 0,n-1);
      printArray(arr1,n);
    }
}
