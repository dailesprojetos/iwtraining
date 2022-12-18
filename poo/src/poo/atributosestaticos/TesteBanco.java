package poo.atributosestaticos;

import java.util.ArrayList;
import java.util.List;

import poo.tarefa.contabancaria.Cliente;
import poo.tarefa.contabancaria.Endereco;

public class TesteBanco {

	public static void main(String[] args) {
		
		
		Endereco e01 = new Endereco("Bezerra de Menezes", "20", "São Gerardo", "60150100", "CE", "Brasil");
		Endereco e02 = new Endereco("Av Sargento Herminio", "144", "Presidente Kennedy", "60150100", "CE", "Brasil");
		Endereco e03 = new Endereco("Treze de Maio", "188", "Fatima", "60150xxx", "CE", "Brasil");

		// Cliente c01 = new Cliente("Maria", LocalDate.of(1999, 06, 28), 5000,e01);
		// Cliente c02 = new Cliente("Lucas", LocalDate.of(2008, Month.JANUARY, 10),
		// 1200,e01);

		Cliente c01 = new Cliente("José", "30/05/2014", 1200, e01);
		Cliente c02 = new Cliente("Maria", "25/01/2000", 1500, e01);
		Cliente c03 = new Cliente("Francisco", "31/01/2022", 8000, e01);
		
		List<Cliente> clientes = new ArrayList<>();
		
		clientes.add(c01);
		clientes.add(c02);

		Banco b01 = new Banco(12345L, e03, List.of(c01,c02));
		Banco b02 = new Banco(12345L, e03, List.of(c03));
		
		System.out.println();
		
		for (Cliente cliente : b01.getClientes()) {
			System.out.println(cliente.toString());
		}
		
		System.out.println("Total no cofre do Banco: "+Banco.verCofre());

	}

}
