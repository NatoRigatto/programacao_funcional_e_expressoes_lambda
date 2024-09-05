package aula_07.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {

		// Cria uma lista de inteiros
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

		// Cria uma stream de inteiros a partir da lista e múltiplica cada ite por 10
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));

		// Soma todos itens da lista a partir da função reduce
		int sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Sum: " + sum);

		// Cria uma nova lista a partir da lista "list" e: filtra por números pares,
		// multiplica cada item da lista por 10 e transforma a stream em lista novamente
		// através do Collectors
		List<Integer> newList = list.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList());
		System.out.println(Arrays.toString(newList.toArray()));

	}

}
