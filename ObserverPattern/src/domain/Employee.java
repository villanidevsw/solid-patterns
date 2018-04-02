package domain;
import java.util.Date;

public class Employee {
	private String name;
	private Date hireDate;
	private int salary;
	public int id;
	private boolean working = false;
	
	private static int COUNTER;

	public Employee(String name, Date hireDate, int salary, boolean working) {
		this.name = name;
		this.hireDate = hireDate;
		this.salary = salary;
		this.id = ++COUNTER;
		this.working = working;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", hireDate=" + hireDate + ", salary=" + salary + ", id=" + id + ", working="
				+ working + "]";
	}
	
	public boolean employeeHasId(int id){
		if (this.id == id) {
			return true;
		}
		return false;
	}
	
}
