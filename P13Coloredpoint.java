/*
 * Create a class named ColoredPoint inheriting the base class Point. 
 * Base class Point have its own coordinate value X and Y. 
 * ColoredPoint, which is a subclass of Point have its own personal property Color. 
 * The subclass also have own method for changeColor. Display the information of the Point with coordinate values and changed color values
 */

 class Point{
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
 }

 class ColoredPoint extends Point{
    String color;
    public ColoredPoint(int x , int y, String color){
        super(x, y);
        this.color= color;
    }
    public void showColor(){
        System.out.println("The color of the point at ("+x+","+y+") is "+ color);
    }
    public void changeColor(String color){
        this.color = color;
    }
 }

 public class P13Coloredpoint {
 
    public static void main(String[] args) {
        ColoredPoint p1 = new ColoredPoint(2, 4,"black");
        p1.showColor();
        p1.changeColor("blue");
        p1.showColor();
    }
 }