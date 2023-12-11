public class Armstrong {
	public static boolean armstrong(int n){
		int duplicate = n;
		int sum = 0;
		while (n>0){
			int lastdigit = n % 10;
			sum = sum + (lastdigit*lastdigit*lastdigit);
			n = n / 10;

		}
		if(sum == duplicate){
			return true;
		}
		else 
		    return false;

	}
	public static void main(String[] args) {
		// Write your code here
        System.out.print(armstrong(371));
	}
}
