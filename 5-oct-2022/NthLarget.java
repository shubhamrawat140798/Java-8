import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.Optional;
 
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
	employeeList.stream()
	.sorted((emp1,emp2)->emp2.getSalary().compareTo(emp1.getSalary()))
	.forEach(e -> System.out.println(e.getName ()+" "+ e.getSalary()));

	System.out.println("\n-------------- 3rd largest----------");
     	Employee emp = employeeList.stream()
            .sorted((emp1, emp2)->emp2.getSalary().compareTo(emp1.getSalary()))
		.skip(2)
		.findFirst()
		.get();
           // .forEach(e -> System.out.println(e.getName() + " " + e.getSalary()));
	System.out.println(emp.getName() + " " + emp.getSalary());
    }
}
