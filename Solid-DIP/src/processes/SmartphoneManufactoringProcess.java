package processes;

public class SmartphoneManufactoringProcess extends GeneralManufactoringProcess {

	public SmartphoneManufactoringProcess(String name) {
		super(name);
		
	}

	@Override
	protected void assembleProduct() {
		System.out.println("assemblying smartphone...");

	}

	@Override
	protected void testProduct() {
		System.out.println("testing smartphone...");

	}

	@Override
	protected void packageProduct() {
		System.out.println("packaging smartphone...");

	}

	@Override
	protected void storeProduct() {
		System.out.println("storing smartphone...");

	}

}
