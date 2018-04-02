package domain;

public class Doctor extends Employee {

	public Doctor(int id, String name, String department, boolean working) {
		super(id, name, department, working);
		System.out.println("Doctor in action...");
	}
	
	private void prescribeMedicine(){
		System.out.println("prescribe medicine");
	}
	
	private void diagnosePatients(){
		System.out.println("diagnosing patient");
	}

	@Override
	public void performDuties() {
		prescribeMedicine();
		diagnosePatients();		
	}
	
}
