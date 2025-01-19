/*
    A) Write a program to design a class Volume and then find out the volume of a Cube, Cylinder 
       and Ellipsoid using method overloading using BufferedReader class object.
    B) Write a program to design a class Volume and then find out the volume of a Cube, Cylinder 
       and Ellipsoid using method overloading using command line argument.

 */

import java.io.*;

class Volume {
    public void findVolume(int r){
        System.out.println("The volume of the cube is : " + r*r*r);
    }
    public void findVolume( int r , int h){
        System.out.println("the volume of the cylinder is : " + Math.PI*r*r*h);
    }
    public void findVolume(int a, int b , int c){
        System.out.println("the volume of the ellipsoid is : " + (4.0/3.0)*Math.PI*a*b*c);
    }
}

public class P9Volume {
    public static void main(String[] args) throws IOException {
        Volume volObj = new Volume();

        System.out.println("using command line arguement : ");
        for(int i = 0 ; i<args.length; i++){
            if(args[i].equals("cube")){
                int side = Integer.parseInt(args[i+1]);
                volObj.findVolume(side);
                i++;
            }
            else if(args[i].equals("cylinder")){
                int r = Integer.parseInt(args[i+1]);
                int h = Integer.parseInt(args[i+2]);
                volObj.findVolume(r,h);
                i+=2;
            }
            else if(args[i].equals("ellipsoid")){
                int  a= Integer.parseInt(args[i+1]);
                int  b= Integer.parseInt(args[i+2]);
                int  c= Integer.parseInt(args[i+3]);

                volObj.findVolume(a,b,c);
                i+=3;
            }
        }



        System.out.println("Using Buffered reader :");
        
        BufferedReader br = null;
        try {
            br= new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the edge of the cube: ");
            int edge = Integer.parseInt(br.readLine());
            volObj.findVolume(edge);

            System.out.print("Enter the radius and height of the cylinder : ");
            int radius = Integer.parseInt(br.readLine());
            int height = Integer.parseInt(br.readLine());
            volObj.findVolume(radius,height);

            System.out.print("Enter all three radius of the ellipsoid : ");
            int radius1 = Integer.parseInt(br.readLine());
            int radius2 = Integer.parseInt(br.readLine());
            int radius3 = Integer.parseInt(br.readLine());
            volObj.findVolume(radius1, radius2, radius3);

        } catch (IOException e) {
            System.out.println("ERROR : "+ e.getMessage());
        }
        finally{
            br.close();
        }
    }
}
