package util;

import java.util.function.Function;

import entities.Produto;

public class UpperCaseNome implements Function<Produto, String>{

	@Override
	public String apply(Produto p) {
		// TODO Auto-generated method stub
		return p.getName().toUpperCase();
	}

}
