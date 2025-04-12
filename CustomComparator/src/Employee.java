public class Employee {
    private Long id;
    private String name;
    private Double salary;

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    //Constructor
    Employee(Long idArg, String nameArg, Double salaryArg){
        id=idArg;
        name=nameArg;
        salary=salaryArg;

    }
}
