package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainListas {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); // Adicionar elementos em uma posi��o espec�fica sem prejudicar o resto.

		System.out.println(list.size()); // Tamanho da lista

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("--------------");
//		list.remove(1);  Remover dado fazendo compara��o com a lista
		list.removeIf(x -> x.charAt(0) == 'M'); // Remover todos que come�am com a letra espec�fica

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("---------------");
		
		//Mostrar os nomes que come�am apenas com a letra A
		//stream n�o � compat�vel com Lista, portanto � necess�rio converte-lo para lista usando collect
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------");
		//Encontrar o primeiro elemento que comece com a letra especificada
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}
