import java.util.Scanner;

public class RecursionSumOne {
    
    public static void print(int i,int n){
        if(i>n){
            return;
        }
        
        System.out.println("Java");
        print(i+1,n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(1,n);
        sc.close();
    }
}
