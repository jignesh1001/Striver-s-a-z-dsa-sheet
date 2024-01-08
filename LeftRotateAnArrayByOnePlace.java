public class LeftRotateAnArrayByOnePlace {
    public static void main(String[] args) {
        int arr1[] = {12,32,33,4,44,5,53,76};
        
        for(int x: reversedArray(arr1,4)){
            System.out.print(x + " ");
        }
    }
    public static int[] reversedArray(int[] arr,int k){
        for(int i = k;i>0;i--)
        {int last = arr[0];
        for(int j =1;j<= arr.length-1;j++){
             arr[j-1] = arr[j];
        }
        arr[arr.length - 1] = last;}
        // for(int x : arr1){
        //     System.out.print(x + " ");
        // }
        return arr;
    }
}
