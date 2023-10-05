package session11_abstraction.challenges.challengesix;

public class Area extends Shape{


    @Override
    protected double RectangleArea(double rectangleLength, double rectangleBreadth){
        return rectangleBreadth * rectangleBreadth;
    }
    @Override
    protected double SquareArea(double squareSide){
        return Math.pow(squareSide,2);
    }
    @Override
    protected double CircleArea(double circleRadius){
        return Math.PI * Math.pow(circleRadius,2);
    }


}
