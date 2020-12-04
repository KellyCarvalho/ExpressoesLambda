package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Consumer;

import entities.Produto;

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
			
			System.out.println("Informe o nome do "+count+"� produto");
			String name =sc.next();
			System.out.println("Informe o preco do "+count+"� produto");
			double price =sc.nextDouble();
			count++;
		 
			list.add(new Produto(name,price));
			
		}
		Consumer<Produto> cons= p->{
			p.setPrice(p.getPrice()-p.getPrice()*0.1);
		};
		list.forEach(cons);//referenciando m�todo statico
		list.forEach(System.out::println);//referenciando m�todo
		
		
		sc.close();

	}

}
