package aula_03.util;

import java.util.function.Consumer;

import aula_03.entities.Product;

public class ProductConsumer implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
		
	}

}
