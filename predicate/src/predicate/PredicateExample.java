package predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Predicate<Integer> isPar = new Predicate<Integer>() {

			@Override
			public boolean test(Integer numero) {
				return numero % 2 == 0;
			}
		};

		List<Integer> numerosPares = new ArrayList<>();
		for (Integer numero : numeros) {
			if (isPar.test(numero)) {
				numerosPares.add(numero);
			}
		}

		for (Integer numeroPare : numerosPares) {
			System.out.println(numeroPare);
		}
	}

}
