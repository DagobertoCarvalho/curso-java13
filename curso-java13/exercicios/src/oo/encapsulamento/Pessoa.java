package oo.encapsulamento;

public class Pessoa {

	private String nome;
	private int idade;
	private String sobreNome;
	
	public Pessoa(String nome, String sobreNome, int idade) {
		setNome(nome);
		setSobreNome(sobreNome);
		setIdade(idade);;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getNomeCompleto() {
		return getNome() + " " + getSobreNome();
	}
	
	// Getter 
	public int getIdade() {
		return idade;
	}
	
	// Setter
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;			
		}
	}
	
	@Override
	public String toString() {
		return "Olá eu sou o " + getNome()
		    + " e tenho " + getIdade() + " anos.";
	}
	
}
