package aula_02.util;

import java.util.function.Predicate;

import aula_02.entities.Product;

public class PredicateProduct implements Predicate<Product> {

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.00;
	}

}
