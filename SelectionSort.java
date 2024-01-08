public class SelectionSort {
    public static void main(String args[]) {
        int arr[] = {12,33,21,3,32,432,38,2};
        int n = arr.length;
        for(int i =0; i<=n-2; i++){
         int min = i;
         for(int j = i;j<=n-1;j++){
            if(arr[j]<arr[min]){
                min = j;
            }
        }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
         
        
    }
    for(int i = 0;i<n ;i++){
        System.out.print(arr[i] + " ");
    }
    
}   

   
}
