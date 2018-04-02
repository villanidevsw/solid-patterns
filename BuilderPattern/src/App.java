
public class App {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo.Builder().color("azul").doors(2)
				.horsePower(140).model("civic").make("Honda").price(30.000)
				.type("sedã médio")
				.build();
		System.out.println(veiculo);

	}

}
