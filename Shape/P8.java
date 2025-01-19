/*
 * 8. Write a program to compute perimeter and area of class Circle, Rectangle and Square using parameterized constructor 
 * (to initialize the dimensions) and methods (to calculate the perimeter) with command line argument.
 */


package Shape;

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
        System.out.println(this.len*this.wid);
    }
    public void getPerimeter(){
        System.out.println(2*(len+wid));
    }
}

class Square{
    private int a;
    public Square(int a){
        this.a= a;
    }
    public void getPerimeter(){
        System.out.println(4*a);
    }
    public void getArea(){
        System.out.println(a*a);
    }
}


public class P8 {
 
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());

        Rectangle r = new Rectangle(4, 5);
        r.getPerimeter();
        r.getArea();

        Square s = new Square(4);
        s.getArea();
        s.getPerimeter();
    }
}