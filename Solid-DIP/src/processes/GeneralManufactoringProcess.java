package processes;

public abstract class GeneralManufactoringProcess {

	private String processName;

	public GeneralManufactoringProcess(String name) {
		this.processName = name;
	}
	
	//template method
	public void launchProcess() {
		if (processHasName()) {
			assembleProduct();
			testProduct();
			packageProduct();
			storeProduct();
		} else {
			System.out.println("no process name was specified");
		}
	}

	private boolean processHasName() {
		return processName != null && !processName.isEmpty() && !"".equalsIgnoreCase(processName);
	}

	protected abstract void assembleProduct();

	protected abstract void testProduct();

	protected abstract void packageProduct();

	protected abstract void storeProduct();

}
