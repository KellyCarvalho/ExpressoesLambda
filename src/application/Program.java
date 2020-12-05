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





public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		List<Integer> newList = l.stream()
				.filter(a ->a %2==0)
				.map(a -> a * 10)
				.collect(Collectors.toList());
			
				
		
		
		
		

	}

}
