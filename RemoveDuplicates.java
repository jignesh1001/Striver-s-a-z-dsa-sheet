public class RemoveDuplicates {
      public static int removeduplicates(int arr[],int n){
        int i = 0;
        for(int j =1;j<n;j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
      }
      public static void main(String[] args) {
        int arr1[] = { 12,33,44,21,22,22,33,2};
        System.out.println(removeduplicates(arr1,arr1.length));
      }
}
