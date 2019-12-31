package classe;

public class Data {

	// Valor padrão 
	//   byte, short, int, long -> 0
	//   float, double -> 0.0
	//   boolean -> false
	//   char -> '\u0000'
	// Objetos -> null
	//   String s = null;

	int dia;
	int mes;
	int ano;

	Data(){
		// dia = 1;
		// mes = 1;
		// ano = 1970;
		this(1, 1, 1970);
		
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String obterDataFormadata() {
		final String formato = "%d/%d/%d";
		return String.format(formato, dia, mes, ano);
	}
	
	void imprimirDataFormadata() {
		System.out.println(this.obterDataFormadata());
	}
	
}
