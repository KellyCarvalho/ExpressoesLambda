package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Predicate;

import entities.Produto;
import util.ProdutoPredicate;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe quantos produtos deseja inserir");
		int n =sc.nextInt();
		
		List<Produto> list = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			System.out.println("Informe o nome do"+i+" produto");
			String name =sc.next();
			System.out.println("Informe o preco do"+i+" produto");
			double price =sc.nextDouble();
		 
			list.add(new Produto(name,price));
			
		}
		Predicate<Produto> pred = p->p.getPrice()<=100;
		list.removeIf(pred);//referência para método
		
		list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		for(Produto p:list) {
			System.out.println(p);
		}
		
		sc.close();

	}

}
