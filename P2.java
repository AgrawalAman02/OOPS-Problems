// 2. Write a program to display Fibonacci series of length n. Length will be taken from command line argument.

public class P2 {
	public static int fibonacci(int n){
		if(n<= 1) return n;
		
		return fibonacci(n-1) + fibonacci(n-2);
	}

	public static void main(String [] args)
	{
		int len = Integer.parseInt(args[0]);
		if(len<0) {
			System.out.println("Enter gte-0");
			return;
		}
		
		else{
			for(int i = 0 ; i<len; i++){
				System.out.println(fibonacci(i) +"   ");
			}
		}
	}
}