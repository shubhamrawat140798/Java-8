import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
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
	  System.out.println("\n---------------Highest Earner------------");	
        Employee highestSalaryEmp = employeeList.stream()
                .max((emp1,emp2)-> emp1.getSalary().compareTo(emp2.getSalary())).get();
	   departmentList.stream()
		.filter(dep -> dep.getEmpId() ==  highestSalaryEmp.getId())
		.forEach(dep -> System.out.println(dep.getDeptName()));
        System.out.println(highestSalaryEmp.getName() + " " + highestSalaryEmp.getSalary());
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
