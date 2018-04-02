package system;
import domain.Employee;
import observerpattern.IObserver;

public class HRDepartment implements IObserver {

	@Override
	public void callMe(Employee employee, String msg) {
		System.out.println("HR have been notified");
		System.out.println(msg+" "+employee.getName());
		
	}

	

}
