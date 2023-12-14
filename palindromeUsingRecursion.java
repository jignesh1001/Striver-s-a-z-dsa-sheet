 class PalindromeUsingRecursion {
    
    static boolean palindrome(String str,int start,int end){
         if(start>end)
          return true;

        if(str.charAt(start) != str.charAt(end))
          return false;
            
         
         return palindrome(str, start+1, end-1);
    }
    public static void main(String args[]){
       String teString = "tppssppt";
       boolean isPalindrome = palindrome(teString, 0, teString.length()-1);
      if(isPalindrome){
        System.out.println(teString + " is palindrome");
      }else{
      System.out.println(teString + " is not palindrome");
    }}
}
