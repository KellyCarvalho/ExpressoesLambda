package util;

import java.util.function.Predicate;

import entities.Produto;

public class ProdutoPredicate implements Predicate<Produto>{

	@Override
	public boolean test(Produto p) {
		// TODO Auto-generated method stub
		return p.getPrice()<=100.0;
	}

}
