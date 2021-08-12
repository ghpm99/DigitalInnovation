package paradigma;

import java.util.function.UnaryOperator;

public class Aula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaryOperator<Integer> calcularValorVezesTres = valor -> valor * 3;
		int valor = 10;
		System.out.println("O resultado e: " + calcularValorVezesTres.apply(valor));
	}

}
