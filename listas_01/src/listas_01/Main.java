package listas_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List <String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());
			
		for(String x : list) {
		System.out.println(x);
		}
		
		System.out.println("----------------------------");
		
		list.removeIf(x -> x.charAt(0) == 'M'); // Removeu a pela letra
		
		for(String x : list) {
			System.out.println(x);
			}
			
		System.out.println("----------------------------");
			
		System.out.println("Index of Bob " + list.indexOf("Bob"));	// mostra a possição do bob
		
		System.out.println("----------------------------");
		
		List <String> resultado = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); //filtra por letra
			
		for(String x : resultado) {
			System.out.println(x);
			}
			
		System.out.println("----------------------------");
		
		list.remove(0); // Removeu o Alex pelo numero da possição
		
		for(String x : list) {
			System.out.println(x);
			}
			
		sc.close();
	}

}
