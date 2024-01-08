public class BubbleSort {
    public static void main(String[] args) {
        int arr1 [] = {1,2,3,4,5,6,56};
        int n = arr1.length;
        for(int i = n-1;i>=1;i--){
            int didSwapHappen = 0;
            for(int j=0;j<=i-1;j++){
                if(arr1[j]>arr1[j+1]){
                    int temp = arr1[j+1];
                    arr1[j+1] = arr1[j];
                    arr1[j] = temp;
                    didSwapHappen +=1;
                }
                
            }
            if(didSwapHappen == 0){
                // System.out.println("already sorted");
                break;
            }
            System.out.println("runs");
            
    }
        for(int i = 0;i<arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
