/**
 * RecursionSum
 */
public class RecursionSum {

    public static int sumOfN(int n){
        int sum = (n+1) * n / 2;
        return sum;
    }
    public static void sumOfN(int i ,int sum){
        if(i<1){
        System.out.println(sum);
        return;
        }
        sumOfN(i-1, sum + i);
    }
    public static int sumOfN(int n,int arr[]){
       int sum = 0;
       for(int i = 0;i<=n;i++){
        sum = sum + i;
       }
    
       return sum;
    }
    public static void main(String args[]){
        int arr1[] = {1,2,3,4,5,6};
        System.out.println(sumOfN(10,arr1));
    }
}