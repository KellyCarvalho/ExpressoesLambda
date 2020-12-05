package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Produto;

public class ServiceProduto {
	
	public double filtrarSoma(List<Produto> list, Predicate<Produto> criterio) {
		double sum =0.0;
		for(Produto p:list) {
			if(criterio.test(p)) {
				sum+=p.getPrice();
			}
		}
		
		return sum;
	}

}
