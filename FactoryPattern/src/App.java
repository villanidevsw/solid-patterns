
public class App {

	public static void main(String[] args) {
		VeiculoFactory factory = new VeiculoFactory();
		Veiculo caminhao = factory.getVeiculo(TipoVeiculo.CAMINHAO);
		Veiculo onibus = factory.getVeiculo(TipoVeiculo.ONIBUS);
		
		caminhao.ligarMotor();
		onibus.ligarMotor();
		
	}

}
