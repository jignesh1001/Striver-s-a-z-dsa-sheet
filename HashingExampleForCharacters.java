import java.util.Scanner;

public class HashingExampleForCharacters {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        // pre computation
        int[] hash = new int[92];
        for(int i =0;i<str.length();i++){
            hash[str.charAt(i)] += 1;


        }
        
        // fetching from hash array
         int noOfQueries;
         noOfQueries = sc.nextInt();
         while(noOfQueries>0){
            char c;
            c = sc.next().charAt(0);
            System.out.println(hash[c]);
            noOfQueries--;
         }
    }
}
