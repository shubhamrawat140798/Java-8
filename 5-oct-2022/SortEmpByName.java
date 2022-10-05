import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
 
class Employee {
    private String name;
    private int salary;
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    
    public Integer getSalary(){
        return salary;
    }
}

class Main {
    public static void main(String[] args) {
      List<Employee> employeeList = new ArrayList<>();
      employeeList.add(new Employee("Frank",1000));
      employeeList.add(new Employee("Alex",1800));
      employeeList.add(new Employee("Simon",1200));
	employeeList.add(new Employee("Adarsh",2000));
      employeeList.add(new Employee("Bob",1400));
      employeeList.add(new Employee("Saksham",3000));
        employeeList.forEach(e -> System.out.println(e.getName ()+" "+ e.getSalary()));
        System.out.println("\n---------After Sorting----------\n");
         employeeList.stream()
            .sorted((emp1, emp2)->emp1.getName().compareTo(emp2.getName()))
            .forEach(e -> System.out.println(e.getName() + " " + e.getSalary()));
    }
}
