
public class App {

	public static void main(String[] args) {
		PerformanceStage instance = PerformanceStage.getInstance();
		instance.turnOnLights();
		System.out.println(instance.getCounter());
		
		PerformanceStage instance2 = PerformanceStage.getInstance();
		instance2.turnOnLights();
		System.out.println(instance2.getCounter());
	}

}
