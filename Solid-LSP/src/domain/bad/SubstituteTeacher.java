package domain.bad;

public class SubstituteTeacher extends Teacher {

	@Override
	public void teach() {
		// porém o prof substituto não ensina lições... esta responsabilidade
		// é do professor titular... desta maneira
		// esta subclasse não poderá ser substituída pela sua classe base (classe pai)
		
		//tentar fazer gambiarra, lançar exceção nesse método, qualquer coisa deste
		//tipo é uma má pratica
		
		//quando nao fazer sentido chamar um metodo na classe filha, que foi herdado
		// da classe pai... é sinal de que o LSP está sendo violado
		// sempre respeitar o "É UM" para fazer sentido

	}

}
