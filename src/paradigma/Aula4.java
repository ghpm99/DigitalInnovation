package paradigma;

import java.util.HashMap;
import java.util.Map;

public class Aula4 {

	public static void main(String[] args) {
		System.out.println(fatorial(5));
		System.out.println(fatorialA(5));
		System.out.println(fatorialMemoization(5));
	}

	public static int fatorial(int numero) {
		if (numero == 1) {
			return numero;
		} else {
			return numero * fatorial((numero - 1));
		}

	}

	public static int fatorialA(int numero) {
		return fatorialComTailCall(numero, 1);
	}

	public static int fatorialComTailCall(int valor, int numero) {
		if (valor == 0) {
			return numero;
		}
		return fatorialComTailCall(valor - 1, numero * valor);
	}
			

	static Map<Integer, Integer> MAPA_FATORIAL = new HashMap<>();
	public static Integer fatorialMemoization(Integer value) {
		if(value == 1) {
			return value;
		}else {
			if(MAPA_FATORIAL.containsKey(value)) {
				return MAPA_FATORIAL.get(value);
			}else {
				Integer resultado = value * fatorialMemoization(value -1);
				MAPA_FATORIAL.put(value, resultado);
				return resultado;
			}
		}
	}
	
	/*
	 * teste
	 * 1-d
	 * 2-a
	 * 3-b
	 */
}
