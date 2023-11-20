import Employee.HRManager;
import Employee.JuniorDeveloper;
import Employee.MidDeveloper;
import Employee.SeniorDeveloper;

public class Main {
    public static void main(String[] args) {
        /*  CIRCLE AND CYLINDER CLASSES TESTS PASSED

            Shapes.Circle circle = new Shapes.Circle(3.75);

            System.out.println("circle.radius= " + circle.getRadius());

            System.out.println("circle.area= " + circle.getArea());

            Shapes.Cylinder cylinder = new Shapes.Cylinder(5.55, 7.25);

            System.out.println("cylinder.radius= " + cylinder.getRadius());

            System.out.println("cylinder.height= " + cylinder.getHeight());

            System.out.println("cylinder.area= " + cylinder.getArea());

            System.out.println("cylinder.volume= " + cylinder.getVolume());
       */

        /*  RECTANGLE AND CUBOID CLASSES TESTS PASSED

            Shapes.Rectangle rectangle = new Shapes.Rectangle(5, 10);

            System.out.println("rectangle.width= " + rectangle.getWidth());

            System.out.println("rectangle.length= " + rectangle.getLength());

            System.out.println("rectangle.area= " + rectangle.getArea());

            Shapes.Cuboid cuboid = new Shapes.Cuboid(5,10,5);

            System.out.println("cuboid.width= " + cuboid.getWidth());

            System.out.println("cuboid.length= " + cuboid.getLength());

            System.out.println("cuboid.area= " + cuboid.getArea());

            System.out.println("cuboid.height= " + cuboid.getHeight());

            System.out.println("cuboid.volume= " + cuboid.getVolume());

         */

        JuniorDeveloper jrDev = new JuniorDeveloper("1","Mahmut Ekrem", 1231.32);
        MidDeveloper midDev = new MidDeveloper("1","Ali Veli",123.32);
        SeniorDeveloper seniorDev = new SeniorDeveloper("1", "Cemal Cemil",121.2);
        HRManager hrMng = new HRManager("1", "Mehmet Ali",12312.5);
        hrMng.addEmployee(jrDev,1);
        hrMng.addEmployee(midDev,5);
        hrMng.addEmployee(seniorDev,-1);
        hrMng.addEmployee(jrDev,1);
    }
}