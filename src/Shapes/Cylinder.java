package Shapes;

import Shapes.Circle;

public class Cylinder extends Circle {
    double height;
    public Cylinder(double radius, double height){
        super(radius);
        this.height = Helper.checkValue(height);
    }

    public double getHeight(){
        return height;
    }

    public double getVolume(){
        return getArea() * getHeight();
    }
}
