package util;

import java.util.function.Consumer;

import entities.Produto;

public class DescontoPreco implements Consumer<Produto>{

	@Override
	public void accept(Produto p) {
		p.setPrice(p.getPrice()-(p.getPrice()*0.1));
		
	}

}
