package factory;

import processes.GeneralManufactoringProcess;
import processes.LaptopManufactoringProcess;
import processes.SmartphoneManufactoringProcess;

public class DeviceFactory {
	
	public static void main(String[] args) {
		GeneralManufactoringProcess smartphoneManufactoringProcess = new SmartphoneManufactoringProcess("Iphone");
		smartphoneManufactoringProcess.launchProcess();
		
		GeneralManufactoringProcess laptopManufactoringProcess = new LaptopManufactoringProcess("SOny vaio");
		laptopManufactoringProcess.launchProcess();
	}
	
	
}
