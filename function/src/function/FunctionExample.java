package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

		Function<Integer, Integer> dobrar = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer numero) {
				return numero * 2;
			}
		};

		List<Integer> numerosDobrados = new ArrayList<>();
		for (Integer numero : numeros) {
			numerosDobrados.add(dobrar.apply(numero));
		}

		for (Integer numerosDobrado : numerosDobrados) {
			System.out.println(numerosDobrado);
		}
	}

}
