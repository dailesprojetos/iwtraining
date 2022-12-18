package poo.atributosestaticos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TesteLoja {

	public static void main(String[] args) {

		Funcionario f01 = new Funcionario("George");
		Funcionario f02 = new Funcionario("Marcos");

		Produto p01 = new Produto("Sapato", 150.0);
		Produto p02 = new Produto("Camisa", 40.0);
		
		Produto p03 = new Produto("Meia", 55.0);
		Produto p04 = new Produto("Calça", 140.0);
		Produto p05 = new Produto("Vestido", 90.0);
		
		Loja l01 = new Loja(List.of(f01), List.of(p01, p02));
		Loja l02 = new Loja(List.of(f02), List.of(p03, p04, p05));

		Map<Produto, Integer> lista = new HashMap<>();

		lista.put(p01, 3);
		lista.put(p02, 2);
		

		l01.realizarVenda(f01, lista);

		l01.resumoVenda(f01, lista);
		
		lista.clear();
		
		lista.put(p03, 2);
		lista.put(p04, 1);
		lista.put(p05, 4);
		
		l01.realizarVenda(f02, lista);

		l01.resumoVenda(f02, lista);
		
		System.out.println("====================================");
		System.out.println("Preço total da lojas: "+Loja.getLucroTotal());
		
	}

}
