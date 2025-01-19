/*
 * Create a class named complex with data members as real and imaginary. 
 * Overload three   constructors to initialize the data members (i.e. default, normal, and through object initialization). 
 * Provide methods which returns object of the complex class as the result     
 * for addition, subtraction, multiplication of two complex numbers.
 */

import java.io.*;

class Complex{
    int real;
    int imaginary;

    public Complex(){
        this.real = 0;
        this.imaginary = 0;
    }
    public Complex(int real , int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public Complex(Complex that){
        this.real = that.real;
        this.imaginary = that.imaginary;
    }

    public static Complex add(Complex a, Complex b){
        return new Complex(a.real+b.real, a.imaginary+b.imaginary);
    }
    public static Complex subtract(Complex a, Complex b){
        return new Complex(a.real-b.real, a.imaginary-b.imaginary);
    }
    public static Complex multiply(Complex a, Complex b){
        return new Complex((a.real*b.real)-(a.imaginary*b.imaginary), (a.real*b.real)+(a.imaginary*b.imaginary));
    }

    public void display(){
        System.out.println(this.real + " + i"+this.imaginary);
    }
}

public class P10Complex {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            // ! -----------------USING DEFAULT CONSTRUCTOR -----------------
            System.out.println("USING DEFAULT CONSTRUCTOR");
            Complex c = new Complex();
            c.display();

            // !-----------------USING PARAMETERISED CONSTRUCTOR -------------------
            System.out.println("USING PARAMETERISED CONSTRUCTOR");
            System.out.println("Enter the real part of the first complex no. : ");
            int real = Integer.parseInt(br.readLine());
            System.out.println("Enter the imaginary part of the first complex no. : ");
            int img = Integer.parseInt(br.readLine());
            Complex comp2 = new Complex(real,img);
            System.out.print("first Complex No:");
            comp2.display();

            System.out.println("Enter the real part of the second complex no. : ");
            real = Integer.parseInt(br.readLine());
            System.out.println("Enter the imaginary part of the second complex no. : ");
            img = Integer.parseInt(br.readLine());
            Complex comp3 = new Complex(real,img);
            System.out.print("second Complex No:");
            comp3.display();

            System.out.print("The addition of both of them is :");
            Complex.add(comp2,comp3).display();
            System.out.print("The subtraction of both of them is :");
            Complex.subtract(comp2,comp3).display();
            System.out.print("The multiplication of both of them is :");
            Complex.multiply(comp2,comp3).display();

            // !------------Using Object in Constructor---------------
            System.out.println("-Using Object in Constructor");
            Complex comp4 = new Complex(comp3);
            Complex comp5 = new Complex(comp2);

            System.out.print("The addition of both of them is :");
            Complex.add(comp4,comp5).display();
            System.out.print("The subtraction of both of them is :");
            Complex.subtract(comp4,comp5).display();
            System.out.print("The multiplication of both of them is :");
            Complex.multiply(comp4,comp5).display();
        }

    }
}
