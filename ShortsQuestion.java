public class ShortsQuestion {
    
    public static void main(String[] args) {
        int arr[] = {7,2,11,7,15,7,1,9};
        int target = 3;
        for(int x: solution(arr, target)){
            System.out.print(x + " ");
        }
    }
     public static int [] solution(int arr[] , int target){
         int result [] = new int[2];
         int didFound = 0;
        for(int i = 0;i<=arr.length-1;i++){
            int diff = target - arr[i];
            for(int j = 0;j<=arr.length-1;j++){
                if(diff == arr[j]){
                    result[0] = i;
                    result[1] = j;  
                    didFound = 1;
                    break;
                }
            }
            if(didFound == 1){
                break;
            }
            
        }
        return result;
     }
}
