public class HashingExample {
    public static int frequencyChecker(int arr[],int num){
        int count = 0;

        for(int i:arr){
            if(i == num){
                count++;
            }
        }
        return count;

    }
    public static void main(String args[]){
        int arr[] = {1,2,3,1,1,6,7};
        System.out.println(frequencyChecker(arr, 1));
    }
}
