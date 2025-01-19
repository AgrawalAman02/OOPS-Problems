/*
 * 8. Write a program to compute perimeter and area of class Circle, Rectangle and Square using parameterized constructor 
 * (to initialize the dimensions) and methods (to calculate the perimeter) with command line argument.
 */


package Shape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Circle{
    private int r;
    public Circle(int r){
        this.r= r;
    }
    public double getPerimeter(){
        return 2*Math.PI*r;
    }
    public double getArea(){
        return Math.PI*r*r;
    }
}

class Rectangle{
    private int len;
    private int wid;

    public Rectangle(int len, int wid){
        this.len = len;
        this.wid = wid;
    }

    public void getArea(){
        System.out.println("Area : " + this.len*this.wid);
    }
    public void getPerimeter(){
        System.out.println("Perimeter : " + 2*(len+wid));
    }
}

class Square{
    private int a;
    public Square(int a){
        this.a= a;
    }
    public void getPerimeter(){
        System.out.println("Perimeter : " + 4*a);
    }
    public void getArea(){
        System.out.println("Area : " + a*a);
    }
}


public class P8 {
 
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){  // used try with resource
            System.out.println("Enter the radius of circle : ");
            int radius = Integer.parseInt(br.readLine());
            Circle c = new Circle(radius);
            System.out.println("Area : " + c.getArea());
            System.out.println("Perimeter : " + c.getPerimeter());

            System.out.println("Enter the length & breadth of rectangle : ");
            int len = Integer.parseInt(br.readLine());
            int wid = Integer.parseInt(br.readLine());
            Rectangle r = new Rectangle(len, wid);
            r.getPerimeter();
            r.getArea();

            System.out.println("enter the edge of the square : ");
            int a = Integer.parseInt(br.readLine());
            Square s = new Square(a);
            s.getArea();
            s.getPerimeter();
        }
        
    }
}