package aula_04.util;

import java.util.function.Function;

import aula_04.entities.Product;

public class ProductFunction implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
