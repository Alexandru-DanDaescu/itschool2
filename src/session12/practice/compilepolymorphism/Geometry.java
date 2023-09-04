package session12.practice.compilepolymorphism;

public class Geometry {

    //method overloading
    //calculate area of a circle
    public double area(double radius){
        return Math.PI * Math.pow(radius,2);
    }


    //calculate area of a triangle
    public double area(double base, double height){
        return 0.5 * base * height;
    }






}
