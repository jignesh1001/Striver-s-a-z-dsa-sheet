import java.util.Scanner;

public class LargestElement {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Maximum element of array is " + maxElement(arr));
        
        
     }
     public static int maxElement(int[] arr1){
         int maximum = Integer.MIN_VALUE;
        for(int i = 0; i <=arr1.length - 1;i++){
            if(arr1[i]> maximum){
                maximum = arr1[i];
            }
        }
        return maximum;
     }
}
