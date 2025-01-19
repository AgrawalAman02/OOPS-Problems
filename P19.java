/*
 * 19. Write a program to handle divide by zero exception with the following message in finally block 
 * Exception occurred if the quotient is -1 otherwise print the result in finally block  (set quotient  
 * initially with -1 as default).

 */

import java.util.Scanner;

public class P19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerator : ");
        int num = sc.nextInt();
        System.out.println("Enter the denominator(we are checking divide by 0 exception ) :");
        int deno = sc.nextInt();
        double quotient = -1;

        try{
            quotient =  num/deno;
        }
        catch(ArithmeticException err){
            System.out.println("Arithmetic Exception : "+ err.getMessage());
        }
        
        finally {
            if(quotient == -1){
                System.out.println("Exception occured...");
            }else{
                System.out.println("the Quotient is : "+ quotient);
            }
            sc.close();
            
        }
    }
}
