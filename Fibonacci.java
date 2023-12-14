import java.util.Scanner;

class Fibonacci {
    // array approach
    static void fseries(int [] arr,int n){
       if(n == 0){
        System.out.println(0);
       }
       else{
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2;i<=arr.length-1;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        for(int i = 0;i<=arr.length-1;i++){
            System.out.print(arr[i] + " ");
        }
       }
    }
    // space optimised approach
    static void fseries(int n){
        if(n == 0){
            System.out.println(0);
        }
        else{
            int secondLast = 0;
            int last = 1;
            System.out.print(secondLast + " " + last + " ");
            int current ;
            for(int i = 2;i<=n;i++){
                current = secondLast + last;
                secondLast = last ;
                last = current;
                System.out.print(current + " ");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int [] arr1 = new int[n+1];
        fseries(arr1,n );
        System.out.println();
        fseries(n);
    }
}
