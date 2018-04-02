
public class VeiculoFactory {

	public Veiculo getVeiculo(TipoVeiculo tipoVeiculo) {
		return tipoVeiculo.getVeiculo();
//		switch (tipoVeiculo) {
//		case CAMINHAO:
//			return new Caminhao();
//		case CARRO:
//			return new Carro();
//		case ONIBUS:
//			return new Onibus();
//		default:
//			return null;
//		}

	}

}
