
public class PerformanceStage {
	//classe singleton
	//construtor private com variavel de instancia estatica
	//contador para provar que só temos uma instancia
	private static int counter;
	private static PerformanceStage INSTANCE = null;
	
	private PerformanceStage(){
		counter++;
	}
	//pra tentar deixar thread safe...
	public synchronized static PerformanceStage getInstance(){
		if (INSTANCE == null) {
			INSTANCE = new PerformanceStage();
		}
		
		return INSTANCE;
	}
	
	public void turnOnLights(){
		System.out.println("ligando as luzes...");
	}

	public int getCounter() {
		return counter;
	}

	
}
