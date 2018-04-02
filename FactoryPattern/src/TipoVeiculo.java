
public enum TipoVeiculo {
	CARRO {
		@Override
		Veiculo getVeiculo() {
			return new Carro();
		}
	},
	ONIBUS {
		@Override
		Veiculo getVeiculo() {
			return new Onibus();
		}
	},
	CAMINHAO {
		@Override
		Veiculo getVeiculo() {
			return new Caminhao();
		}
	};

	abstract Veiculo getVeiculo();
}
