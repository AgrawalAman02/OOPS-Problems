//1. A Write a program to show the number is prime or not. Data will be taken from command line argument.

public class P1A
{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		boolean flag = true;
		int i = 2;
		while(i<n){
			if(n%i == 0) flag= false;
			i++;
		}
		if(flag) System.out.println(n+ " is prime ");
		else System.out.println(n+ " is not prime ");
	}
}
