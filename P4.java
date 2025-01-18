//4. Write a program to arrange a set of integer numbers in ascending order where input will be taken through command line argument.
public class P4{
	public static void main(String [] args){
		int n  =  args.length;
		for(int i = 0 ; i<n-1; i++){
			for(int j = 0 ; j<n-i-1; j++){
				if(Integer.parseInt(args[j]) > Integer.parseInt(args[j+1])){
					String temp = args[j];
					args[j] = (args[j+1]);
					args[j+1] = temp;	
				}
				
			}
		}

		for(int i = 0 ; i<n; i++){
			System.out.println(args[i]);
		}
	}
	
}

		