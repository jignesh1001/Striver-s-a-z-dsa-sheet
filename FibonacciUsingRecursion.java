public class FibonacciUsingRecursion {
    static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        int last = fibonacci(n-1);
        int secondlast = fibonacci(n-2);

        return last + secondlast;
    } 
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fibonacci(n));
    }
}
