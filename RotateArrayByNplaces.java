/**
 * RotateArrayByNplaces
 */
import java.util.ArrayList;
public class RotateArrayByNplaces {
     public static void main(String[] args) {
        int arr1 [] = { 1,23,34,222,4322,2,1};  
        int d = 1;
        rotateArray(arr1, d);
    
     }
    public static void rotateArray(int arr[] ,int d){
        ArrayList <Integer> temp = new ArrayList<>(); 
        if(d > arr.length){
            d = d % arr.length;
        }
        for(int i = 0;i<d;i++){
            temp.add(arr[i]);
        }       
        for(int i = d;i<arr.length;i++){
            arr[i-d] = arr[i];
        }
        
        // for(int i= 0;i<temp.size();i++){
        //    arr[arr.length-d+i] = temp.get(i);
            
        // }
        for(int i = arr.length-d;i<arr.length;i++){
            arr[i] = temp.get(i-(arr.length-d));
        }
        for(int x: arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    
}