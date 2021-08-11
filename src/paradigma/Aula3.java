package paradigma;

public class Aula3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcao gerarUmaSaida = v -> "Sr. "+ v;
		System.out.println(gerarUmaSaida.gerar("Joao"));
	}

}

@FunctionalInterface //anotação para proteger que a interface seja somente funcional
interface Funcao{
	String gerar(String valor);
}

/*teste
 * 1-d
 * 2-d
 * 3-e
 * 4-a
*/