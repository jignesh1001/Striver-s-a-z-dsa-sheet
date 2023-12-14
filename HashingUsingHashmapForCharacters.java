import java.util.HashMap;
import java.util.Map;
class HashingUsingHashmapForCharacters {

    public static void main(String args[]){
        int arr1 [] = { 1,1,5,3,5,5,6,5,4,4,6,6,6};
        countFrequency(arr1, arr1.length);
    }
 public static void countFrequency(int arr[],int n){
    HashMap<Integer,Integer> hmap = new HashMap<>();
    for(int i = 0;i<n;i++){
        if(hmap.containsKey(arr[i])){
            hmap.put(arr[i],hmap.get(arr[i])+1);
        }
        else{
            hmap.put(arr[i], 1);
        }
    }
    int maxFreq = 0,minFreq = n;
    int maxElement =0 , minElement = 0;

    // Traverse through map
    for(Map.Entry<Integer,Integer> it : hmap.entrySet()){
        System.out.println(it.getKey() + "->" + it.getValue());

        int count = it.getValue();
        int element = it.getKey();

        if(count >= maxFreq){
            maxElement = element;
            maxFreq = count;
        }
        if(count <= minFreq){
            minElement = element;
            minFreq = count;
        }
    }
    System.out.println(maxElement);
    System.out.println(minElement);
 }   
}
