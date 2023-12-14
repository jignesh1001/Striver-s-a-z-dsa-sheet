import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class HashingUsingHashmap {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n; 
        n = sc.nextInt();
        Map<Integer,Integer> hpp = new HashMap<>();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
           arr[i] = sc.nextInt();
           int key = arr[i];
            int freq = 1;
            if(hpp.containsKey(key)){
                freq = hpp.get(key) + 1;
                
            }
            hpp.put(key, freq);
        }

        // itrate over map
        for (Map.Entry<Integer, Integer> it : hpp.entrySet()) {
            System.out.println(it.getKey() + "->" + it.getValue());
        }
        int queries;
        queries = sc.nextInt();
        while(queries > 0){
            int num;
            num = sc.nextInt();
            if(hpp.containsKey(num)) {
             System.err.println(hpp.get(num));
            }
            else{
                System.out.println(0);
            }
            queries--;
        }


     }
}
