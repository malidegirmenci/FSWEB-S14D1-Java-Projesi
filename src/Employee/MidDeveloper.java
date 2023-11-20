package Employee;

public class MidDeveloper extends Employee{
    public MidDeveloper(String id, String name, Double salary) {
        super(id, name, salary);
    }
    @Override
    public void work() {
        System.out.println("Mid Developer starts to working");
    }
}
