package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;



import entities.Produto;
import model.services.ServiceProduto;
import util.UpperCaseNome;

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
	
		Stream<Double> p = list.stream().map(x->x.getPrice()*15);//gerou um stream com os resultados
		System.out.println(Arrays.toString(p.toArray()));
		
		Stream<String> produtos = Stream.of("Notebook","Televisão","Geladeira");
		System.out.println(Arrays.toString(produtos.toArray()));
		
		Stream<Integer> bonus = Stream.iterate(0, x->x+1);
		System.out.println(Arrays.toString(bonus.limit(10).toArray()));
		
		
		
		sc.close();

	}

}
