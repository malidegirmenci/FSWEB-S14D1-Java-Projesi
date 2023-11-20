package Employee;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(String id, String name, Double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Senior Developer starts to working");
    }
}
