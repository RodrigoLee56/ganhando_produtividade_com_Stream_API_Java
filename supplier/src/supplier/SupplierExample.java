package supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<String> saudacao = new Supplier<String>() {
			@Override
			public String get() {
				return "Olá, Javaman!";
			}
		};

		List<String> listaDeSaudacao = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			listaDeSaudacao.add(saudacao.get());
		}

		for (String saudacaoGerada : listaDeSaudacao) {
			System.out.println(saudacaoGerada);
		}
	}

}
