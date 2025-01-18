//3. Take a String as input using command line argument and now check whether it is a palindrome or not.

public class P3{
	public static void main(String [] args){
		String str = args[0];
		int n = str.length();
		String s = str.toLowerCase();
		int i = 0;
		int j= n-1;
		while(i<=j){
			if(s.charAt(i) != s.charAt(j)) {
				System.out.println("Not Palindrome");
				return;
			}
			i++;
			j--;
		}
		System.out.println("Palindrome");
	}
}
	