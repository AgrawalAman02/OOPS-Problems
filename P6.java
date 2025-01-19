/*
 * Write a program to create 2d-array of following shape and print the following pattern 
a)
       1
       1 0
       1 0 1
       1 0 1 0
       :::::::::::::::::::::
       up to n. where n will be User Input, taken from command line argument.

 */

public class P6 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for(int i = 0 ; i<n;i++){
            for(int j = 0 ; j<=i; j++){
                if((j & 1) == 1){
                    System.out.print("0 ");
                }else System.out.print("1 ");
            }
            System.out.println();
        }
    }
}
