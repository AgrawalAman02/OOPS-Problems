/*
 * 7. Create a class named DesignPattern with different static methods to draw triangle, rectangle, square etc using *. 
 *    Demonstrate the class using main method.
 */

class DesignPattern {
    public static void drawSquare(int n){
        for(int i = 0 ; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print("* ");  // for square of *

                /*  // for square border
                 if(i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                 */

            }
            System.out.println();
        }
    }
    public static void drawTriangle(int n){
        for(int i = 0 ; i<n; i++){
            for(int j = n-1; j>i; j--){
                System.out.print(" ");
            }
            for (int j =0 ; j <=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void drawRectangle(int m, int n){
        for(int  i =  0 ; i<m;i++){
            for (int j = 0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class P7 {
    public static void main(String[] args) {
        DesignPattern.drawSquare(5);
        System.out.println();
        DesignPattern.drawRectangle(4,8);
        System.out.println();
        DesignPattern.drawTriangle(5);
    }    
}
