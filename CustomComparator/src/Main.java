import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        List<Employee> employess = new ArrayList<>();

        initializeEmployees(employess);

//        employess.stream().sorted(Comparator.comparing(Employee::getName)).forEach(employee -> System.out.println(employee.getName()));
        employess.stream().sorted(new CustomComparator()).forEach(employee -> System.out.println(employee.getName()));

        System.out.println("same thing without custom comparator, lol, just chaining of existing comparators");
        employess.stream().sorted(Comparator.comparing(Employee::getSalary).reversed().thenComparing(Employee::getName))
                .forEach(employee -> System.out.println(employee.getName()));
    }

    private static void initializeEmployees(List<Employee> employees) {

        Employee Fiza = new Employee(4L,"Fiza", 7.5);
        Employee Bijan = new Employee(1L,"Bijan", 7.5);
        Employee Ashutosh = new Employee(2L,"Ashutosh", 25.0);
        Employee Rohit = new Employee(3L,"Rohit", 7.0);


        employees.add(Fiza);
        employees.add(Bijan);
        employees.add(Ashutosh);
        employees.add(Rohit);
    }

    public static class CustomComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            if(o1.getSalary() > o2.getSalary())
                return -1;
            else if(o1.getSalary() < o2.getSalary()){
                return 1;
            }
            else{
                return o1.getName().compareTo(o2.getName());
            }
        }


    }
}