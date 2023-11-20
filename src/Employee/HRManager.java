package Employee;

import java.util.Arrays;

public class HRManager extends Employee{
    JuniorDeveloper[] jrDevs = new JuniorDeveloper[5];
    MidDeveloper[] midDevs = new MidDeveloper[5];
    SeniorDeveloper[] seniorDevs = new SeniorDeveloper[5];

    public HRManager(String id, String name, Double salary) {
        super(id, name, salary);

    }
    @Override
    public void work() {
        System.out.println("HR Manager starts to working");
    }

    public void addEmployee(JuniorDeveloper jrDev, int index) {
        if (index < 0) {
            System.out.println("Index must not less then 0");
        } else if (jrDevs.length <= index) {
            System.out.println("Index must not over limit of Array");
        } else if (jrDevs[index] != null) {
            System.out.println("Index of array is full. You can not add new value.");
        }else{
            System.out.println(jrDev.name+" has been added to list");
            jrDevs[index] = jrDev;
        }
    }
    public void addEmployee(MidDeveloper midDev, int index) {
        if (index < 0) {
            System.out.println("Index must not less then 0");
        } else if (midDevs.length <= index) {
            System.out.println("Index must not over limit of Array");
        } else if (midDevs[index] != null) {
            System.out.println("Index of array is full. You can not add new value.");
        }else{
            System.out.println(midDev.name+" has been added to list");
            midDevs[index] = midDev;
        }
    }

    public void addEmployee(SeniorDeveloper seniorDev, int index) {
        if (index < 0) {
            System.out.println("Index must not less then 0");
        } else if (seniorDevs.length <= index) {
            System.out.println("Index must not over limit of Array");
        } else if (seniorDevs[index] != null) {
            System.out.println("Index of array is full. You can not add new value.");
        }else{
            System.out.println(seniorDev.name+" has been added to list");
            seniorDevs[index] = seniorDev;
        }
    }

    @Override
    public String toString() {
        return "HRManager{" +
                "jrDevs=" + Arrays.toString(jrDevs) +
                ", midDevs=" + Arrays.toString(midDevs) +
                ", seniorDevs=" + Arrays.toString(seniorDevs) +
                '}';
    }
}
