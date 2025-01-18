//1.  B) Write a program to show the numbers which are prime in a given range using command line

class P1B{
	public static Boolean checkPrime(int n){
		int i = 2;
		while(i<n){
			if(n%i == 0) return false;
			i++;
		}
		return true;
	}
	
	public static void main(String [] args ) {
		int start = Integer.parseInt(args[0]);
		int end = Integer.parseInt(args[1]);
		System.out.println("So the range provided by you is from " + start + " to "+end);
		System.out.println("So the result for the prime is following : ");
		for(int i = start ; i<=end; i++){
			if(i <=1) { System.out.println(i +" : "+ false); }
			else {
				System.out.println(i +" : "+ checkPrime(i));
			}
		}
	}
}
			