import java.util.ArrayList;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int arr[] ={1,3,322,322,32,3,2};
        ArrayList <Integer> temp = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>0){
            temp.add(arr[i]);
        }

        }
        for(int i =0;i<temp.size();i++){
            arr[i] = temp.get(i);
        }
        System.out.println(temp.size());
        System.out.println(arr.length);
        for(int i = temp.size();i<arr.length;i++){
            arr[i] = 0;
        }
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
