package domain;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	private List<Employee> employees;
	
	private Employee emp1;
	private Employee emp2;
	private Employee emp3;
	private Employee emp4;
	private Employee emp5;
	
	public EmployeeDAO() {
		emp1 = new Employee("Mike",null,9000,false);
		emp2 = new Employee("Jose",null,8000,false);
		emp3 = new Employee("Pedro",null,7000,false);
		emp4 = new Employee("Maria",null,4000,false);
		emp5 = new Employee("Joana",null,1400,false);
		employees = new ArrayList<>();
	}
	
	public List<Employee> generateEmployees(){
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		
		return employees;
	}
	
	public void addEmployee(Employee employee){
		employees.add(employee);
	}
}
