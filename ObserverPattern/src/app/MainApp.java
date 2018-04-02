package app;
import java.util.Date;

import domain.Employee;
import observerpattern.IObserver;
import system.EmployeeManagementSystem;
import system.HRDepartment;
import system.PayrollDepartment;

public class MainApp {

	public static void main(String[] args) {
		IObserver payroll = new PayrollDepartment();
		IObserver hrSystem = new HRDepartment();
		
		EmployeeManagementSystem ems = new EmployeeManagementSystem();
		
		ems.registerObserver(payroll);
		ems.registerObserver(hrSystem);
		
		Employee emp = new Employee("Henrique", new Date(), 4500, true);
		ems.hireNewEmployee(emp);
		ems.modifyEmployeeName(3, "Mico");
	}

}
