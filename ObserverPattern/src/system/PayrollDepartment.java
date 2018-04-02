package system;
import domain.Employee;
import observerpattern.IObserver;

public class PayrollDepartment implements IObserver {


	@Override
	public void callMe(Employee employee, String msg) {
		System.out.println("Payroll have been notified");
		System.out.println(msg+" "+employee.getName());
		
	}

}
