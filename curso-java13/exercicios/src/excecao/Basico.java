package excecao;

public class Basico {

	public static void main(String[] args) {
		
		Aluno a1 = null;

		try {
			imprimirNomeDoAluno(a1);
		} catch (Exception e) {
//          O erro pode ser silenciado ou gera no arquivo de log  | biblioteca para logar o erro - digitar web "java logger library" o mais usado http://www.slf4j.org/
//			System.out.println("Ocorreu um erro no momento "
//					+ "de imprimir o nome do usuário");
		}
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
//          O erro pode ser silenciado ou gera no arquivo de log 
//			System.out.println("Ocorreu o erro: " + e.getMessage());
			// e.printStackTrace();
		}
		
		System.out.println("Fim");
	}
	
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
