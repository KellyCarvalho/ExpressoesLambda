package application;

import java.util.Comparator;

import entities.Produto;

public class MeuComparador implements Comparator<Produto> {

	@Override
	public int compare(Produto p1, Produto p2) {
		// TODO Auto-generated method stub
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

}
