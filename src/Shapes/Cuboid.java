package Shapes;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double width, double length, double height){
        super(width, length);
        this.height = Helper.checkValue(height);
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea() * getHeight();
    }
}
