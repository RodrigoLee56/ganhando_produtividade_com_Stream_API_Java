package supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<String> saudacao = () -> "Olá, Javaman!";

		List<String> listaDeSaudacao = Stream.generate(saudacao).limit(5).collect(Collectors.toList());

		listaDeSaudacao.forEach(System.out::println);
	}

}
