package Lambda4;

import java.util.function.Function;

import Lambda4.Product;

public class UpperCaseName implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}
}