package system;
import java.util.ArrayList;
import java.util.List;

import domain.Employee;
import domain.EmployeeDAO;
import observerpattern.IObserver;
import observerpattern.ISubject;

public class EmployeeManagementSystem implements ISubject {
	private Employee employee;
	private List<IObserver> observerList;
	private List<Employee> employees;
	private EmployeeDAO employeeDAO;
	private String msg;
	
	public EmployeeManagementSystem(){
		employeeDAO = new EmployeeDAO();
		observerList = new ArrayList<>();
		employees = employeeDAO.generateEmployees();
	}
	
	@Override
	public void notifyObservers(){
		observerList.forEach(observer -> observer.callMe(employee,msg));
	}

	@Override
	public void registerObserver(IObserver observer) {
		addObserver(observer);		
	}

	private void addObserver(IObserver observer) {
		observerList.add(observer);		
	}

	@Override
	public void unregisterObserver(IObserver observer) {
		removeObserver(observer);
		
	}

	private void removeObserver(IObserver observer) {
		observerList.remove(observer);	
		
	}

	public void hireNewEmployee(Employee emp) {
		employee = emp;
		msg = "New employee has been hired: ";
		employees.add(emp);
		notifyObservers();		
	}
	
	public void modifyEmployeeName(int id, String newName){
		
		employees.stream().forEach(emp ->{
			if (emp.employeeHasId(id)) {
				emp.setName(newName);
				employee = emp;
				msg = "Employee name has been modified: ";
				notifyObservers();
			}
		});
	}
}
