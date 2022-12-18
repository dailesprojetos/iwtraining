package poo.tarefa.contabancaria;

import java.util.ArrayList;
import java.util.List;

public class TesteCaixaAutomatico {

	public static void main(String[] args) {

		// Cliente c01 = new Cliente("Maria", LocalDate.of(1999, 06, 28), 5000);
		// Cliente c02 = new Cliente("Lucas", LocalDate.of(2008, Month.JANUARY, 10),
		// 1200);

		Endereco e01 = new Endereco("Bezerra de Menezes", "20", "São Gerardo", "60150100", "CE", "Brasil");

		// Cliente c01 = new Cliente("Maria", LocalDate.of(1999, 06, 28), 5000,e01);
		// Cliente c02 = new Cliente("Lucas", LocalDate.of(2008, Month.JANUARY, 10),
		// 1200,e01);

		Cliente c01 = new Cliente("José", "30/05/2014", 1200, e01);
		Cliente c02 = new Cliente("Maria", "25/01/2000", 1500, e01);

		List<Cliente> clientes = new ArrayList<>();
		
		clientes.add(c01);
		clientes.add(c02);
		
		for (Cliente cliente : clientes) {
			
			System.out.println("Codigo: "+cliente.getCodigo());
			System.out.println("Cliente:"+cliente.getNome());
			System.out.print("-logradouro: "+cliente.getEndereco().getLogradouro()
					+" \n-nº:  "+cliente.getEndereco().getNumero()
					+" \n-bairro: "+cliente.getEndereco().getBairro()
					+" \n-cep:  "+cliente.getEndereco().getCep()
					+" \n-estado:  "+cliente.getEndereco().getEstado()
					+" \n-pais:  "+cliente.getEndereco().getPais()
					);
			System.out.print("\nData de Nascimento: "+cliente.getDataDeNascimento());
			System.out.print("\nSaldo: "+cliente.getSaldo());
			System.out.println("\n===================================");
			
		}

		/*c01.verSaldo();
		c02.verSaldo();

		c02.saque(2000);
		c01.deposito(1000);
		c01.transferir(c02, 1000);
		c02.saque(1000);

		c01.verSaldo();
		c02.verSaldo();*/

	}

}
