package Lambda3;

import java.util.function.Consumer;

import Lambda3.Produto;

public class PriceUpdate implements Consumer<Produto> {

	@Override
	public void accept(Produto p) {
		p.setPrice(p.getPrice() * 1.1);
	}
}
