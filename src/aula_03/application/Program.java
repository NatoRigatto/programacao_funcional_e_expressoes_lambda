package aula_03.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import aula_03.entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		list.forEach(System.out::println);

	}

}
