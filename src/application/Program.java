package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Predicate;

import entities.Produto;
import util.DescontoPreco;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe quantos produtos deseja inserir");
		int n =sc.nextInt();
		
		List<Produto> list = new ArrayList<>();
		
		int count=1;
		for(int i=0;i<n;i++) {
			
			System.out.println("Informe o nome do "+count+"º produto");
			String name =sc.next();
			System.out.println("Informe o preco do "+count+"º produto");
			double price =sc.nextDouble();
			count++;
		 
			list.add(new Produto(name,price));
			
		}
		list.forEach(new DescontoPreco());//aplicando desconto
		list.forEach(System.out::println);//referenciando método
		
		
		sc.close();

	}

}
