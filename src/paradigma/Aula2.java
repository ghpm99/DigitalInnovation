package paradigma;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Aula2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] valores = { 1, 2, 3, 4 };

		// funcional
		Arrays.stream(valores).filter(numero -> numero % 2 == 0).map(numero -> numero * 2)
				.forEach(numero -> System.out.println(numero));

		// imperativo
		for (int i = 0; i < valores.length; i++) {
			int valor = 0;
			if (valores[i] % 2 == 0) {
				valor = valores[i] * 2;

				if (valor != 0) {
					System.out.println(valor);
				}
			}
		}
		System.out.println("Funcao puras:");
		funcaoPuras();
		System.out.println("Imutabilidade:");
		imutabilidade();

		
		Function<Integer, Object> buscarUsuario = idUsuario ->  new Object();//declara um comportamento
		
	}

	public static void funcaoPuras() {
		BiPredicate<Integer, Integer> verificarSeEMaior = (parametro, valorComparacao) -> parametro > valorComparacao;
		System.out.println(verificarSeEMaior.test(13, 12));
		System.out.println(verificarSeEMaior.test(13, 12));
	}

	public static void imutabilidade() {
		int valor = 20;
		UnaryOperator<Integer> retornarDobro = v -> v * 2; // produz um novo valor
		System.out.println(retornarDobro.apply(valor)); 
		System.out.println(valor);
	}
	
	/*
	 * Testes:
	 * 1-e
	 * 2-c
	 * 3-b
	 */
	

}
