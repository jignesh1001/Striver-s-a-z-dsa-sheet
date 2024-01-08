public class LinearSearch {
 public static int linearSearch(int arr[],int num){
    
    for(int i = 0;i< arr.length;i++){
        if(arr[i] == num){
            return i;
        }
    }
    return -1;
 }
 public static void main(String[] args) {
    int arr1 [] = {1,22,33,23,33,34};
    System.out.println(linearSearch(arr1, 34));
 }
}
