/*
 * Q. Write a program using an interface called Volume. 
 * Assume that there is a part in a machine having three dimension s1, s2, s3 and 
 * Involume=1/3*pi*s1*s2*s3 Outvolume=4/3* pi*s1*s2*s3
 * 
 */

 interface Volume{
    double inVolume();
    double outVolume();
 }

 class MachinePart implements Volume{
    private double s1, s2, s3;
    
    public MachinePart(double s1, double s2, double s3){
        this.s1  = s1;
        this.s2 = s2; 
        this.s3 = s3;
    }

    public double inVolume(){
        return (1.0/3.0) * Math.PI * s1*s2*s3;
    }

    public double outVolume(){
        return (4.0/3.0)* Math.PI*s1*s2*s3;
    }

    public void displayVolume(){
        System.out.println("Involume : "+ inVolume());
        System.out.println("OutVolume : "+ outVolume());
    }
 }

public class P16Interface {
    public static void main(String[] args) {
        MachinePart p = new MachinePart(1, 2, 3);
        p.displayVolume();
    }
}
