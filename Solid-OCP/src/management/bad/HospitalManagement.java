package management.bad;

import domain.bad.Doctor;
import domain.bad.Employee;
import domain.bad.Nurse;

public class HospitalManagement {
	//viola todo o principio do ocp
	// a cada novo tipo de employee a classe tem que ser modificada!
	// além do que a classe sabe de mais sobre o comportamento dos objetos
	public void callUpon(Employee employee){
		if (employee instanceof Nurse) {
			checkVitalSigns();
			drawBloods();
			cleanPatientArea();
		}else if (employee instanceof Doctor){
			prescribeMedicine();
			diagnosePatients();
		}
	}
	
	//nurses
	private void checkVitalSigns(){
		System.out.println("checking vitals");
	}
	
	private void drawBloods(){
		System.out.println("drawing blood");
	}
	
	private void cleanPatientArea(){
		System.out.println("checking vitals");
	}
	
	//doctors
		private void prescribeMedicine(){
			System.out.println("prescribe medicine");
		}
		
		private void diagnosePatients(){
			System.out.println("diagnosing patient");
		}
		
		
}
