package interfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//aula sobre interface funcional
public class AulaInterface1 {

	public static void main(String[] args) {
		Calculo soma = (a, b) -> a + b;
		Calculo subtrai = (a, b) -> a - b;
		Calculo divisao = (a, b) -> a / b;
		Calculo multiplicacao = (a, b) -> a * b;

		Consumer<String> imprimir = System.out::println;

		Function<Integer, String> converterInteiroParaString = inteiro -> String.valueOf(inteiro);

		imprimir(imprimir, converterInteiroParaString.apply(executarOperacao(soma, 1, 3)));
		imprimir(imprimir, converterInteiroParaString.apply(executarOperacao(subtrai, 1, 3)));
		imprimir(imprimir, converterInteiroParaString.apply(executarOperacao(divisao, 1, 3)));
		imprimir(imprimir, converterInteiroParaString.apply(executarOperacao(multiplicacao, 1, 3)));	
		

	}

	public static int executarOperacao(Calculo calculo, int a, int b) {
		return calculo.calcular(a, b);
	}

	public static void imprimir(Consumer<String> consumer, String text) {
		consumer.accept(text);
	}

}

@FunctionalInterface
interface Calculo {
	public int calcular(int a, int b);
	
}
