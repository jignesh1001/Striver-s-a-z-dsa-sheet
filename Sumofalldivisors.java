
public class Sumofalldivisors {
    public static int sumOfAllDivisors(int n){
        // Write your code here.
        int totalSum = 0;
        for(int num = 1;num <= n;num++){
        int sum = 0;
        
        for(int i = 1;i<=n;i++){
         if(n % i ==0){
             sum += i;
         }
        }
        totalSum = totalSum + sum;
        }
        return totalSum;
    }
     public static void main(String[] args) {
        
        System.out.println(sumOfAllDivisors(3));
     }

    
}