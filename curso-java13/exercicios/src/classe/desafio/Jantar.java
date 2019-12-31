package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arroz", 0.223);
		Comida c2 = new Comida("Feijao", 0.300);
		
		Pessoa p = new Pessoa("João", 99.8);
		
		System.out.println(p.apresentar());
		p.commer(c1);
		
		System.out.println(p.apresentar());
		p.commer(c2);
		
		System.out.println(p.apresentar());
	}
}
