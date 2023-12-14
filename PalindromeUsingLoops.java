public class PalindromeUsingLoops {
    public static Boolean check(String str,int start ,int end){
        start = 0;
        end = str.length()-1;
        while(start<end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }else{
            start++;
            end--;
       }
    }
    return true;
     
    }
    public static void main(String[] args) {
        String testString = "abcddcba";
        boolean isPalindrome = check(testString,0,testString.length()-1);
        if(isPalindrome){
            System.out.println(testString + " is palindrome");
        }
        else{
            System.out.println(testString + " is not palindrome");
        }
    }
}
