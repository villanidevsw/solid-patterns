package processes;

public class LaptopManufactoringProcess extends GeneralManufactoringProcess {

	public LaptopManufactoringProcess(String name) {
		super(name);
		
	}

	@Override
	protected void assembleProduct() {
		System.out.println("assemblying laptop...");

	}

	@Override
	protected void testProduct() {
		System.out.println("testing laptop...");

	}

	@Override
	protected void packageProduct() {
		System.out.println("packaging laptop...");

	}

	@Override
	protected void storeProduct() {
		System.out.println("storing laptop...");

	}

}
