package Employee;

public class Employee {
    private String id;
    private String name;
    private Double salary;

    public Employee(String id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println("Employee starts to working.");
    }
}
