package Employee;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(String id, String name, Double salary) {
        super(id, name, salary);
    }
    @Override
    public void work() {
        System.out.println("Junior Developer starts to working");
    }
}
