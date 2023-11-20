package Shapes;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = Helper.checkValue(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = Helper.checkValue(radius);
    }

    public double getArea(){
        return Math.pow(radius,2) * Math.PI;
    }
}
