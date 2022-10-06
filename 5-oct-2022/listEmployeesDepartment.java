import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();
        employeeList.add(new Employee(1,"James",45000));
        employeeList.add(new Employee(2,"Raj",40000));
        employeeList.add(new Employee(3,"Adi",34000));
        employeeList.add(new Employee(4,"Tina",35000));
        employeeList.add(new Employee(5,"Ravi",25000));
        employeeList.add(new Employee(6,"Meena",15000));
	  System.out.println("---------------Emplyoee List--------------");
	  employeeList.stream().forEach(emp -> System.out.println( emp.getId() + " " +emp.getName() + " " + emp.getSalary()) );

        departmentList.add(new Department("HR",1));
        departmentList.add(new Department("Finance",2));
        departmentList.add(new Department("IT",3));
        departmentList.add(new Department("Finance",4));
        departmentList.add(new Department("HR",5));
        departmentList.add(new Department("IT",6));
	  System.out.println("\n---------------Department--------------");	
	  departmentList.stream().forEach(dep -> System.out.println(dep.getDeptName() + " " + dep.getEmpId()));
	  System.out.println("\n---------------IT Department--------------");
	  List<Department> department = departmentList.stream()
		.filter(dep -> dep.getDeptName() == "IT").collect(Collectors.toList());
	  
	  for(Department deptEmp : department) {
		employeeList.stream().filter(emp -> emp.getId() == deptEmp.getEmpId())
		.forEach(emp -> System.out.println( emp.getId() + " " +emp.getName() + " " + emp.getSalary()));
	  }
	  department.stream().forEach(dept -> System.out.println());
    }
}
class Employee {
    private int id;
    private String name;
    private float salary;

    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Float getSalary() {
        return salary;
    }
}
class Department {
    private String DeptName;
    private int empId;

    public Department(String deptName, int empId) {
        DeptName = deptName;
        this.empId = empId;
    }

    public String getDeptName() {
        return DeptName;
    }

    public int getEmpId() {
        return empId;
    }
}
