package poo.atributosestaticos;

/** funcionarios List(<String: nome>)
	produtos List(<String: nome, double: preco>)
	lucroLoja
	lucroTotal
	despesaLoja
	despesasTotal

	realizarVenda(funcionario,<produtos,quantidade>) : void
	gerarBalancoLoja : (lucro-despesa)
	gerarBalancoTotal : (lucroTotal - despesaTotal)**/

import java.util.List;
import java.util.Map;

public class Loja {

	private static double lucroTotal;
	private static double despesaTotal;

	private List<Funcionario> funcionarios;
	private List<Produto> produtos;

	private double lucroLoja;
	private double despesaLoja;

	public Loja(List<Funcionario> funcionarios, List<Produto> produtos) {
		lucroLoja = 0;
		despesaLoja = 0;
		this.funcionarios = funcionarios;
		this.produtos = produtos;
	}

	public void realizarVenda(Funcionario funcionario, Map<Produto, Integer> lista) {

		for (Produto produto : lista.keySet()) {
			double preco = produto.getPreco();
			int quantidade = lista.get(produto);
			
			double total = quantidade * preco;

			this.lucroLoja += total;
			lucroTotal += total;
		}

	}

	public void resumoVenda(Funcionario funcionario, Map<Produto, Integer> lista) {

		double total = 0;

		System.out.println("====================================");
		System.out.println("vendedor: " + funcionario.getNome());

		for (Produto produto : lista.keySet()) {
			double preco = produto.getPreco();
			int quantidade = lista.get(produto);
			total += preco * quantidade;

			System.out.println(
					"- " + produto.getNome() + " " + preco + " x " + quantidade + " = " + (preco * quantidade));
		}
		System.out.println("====================================");
		System.out.println("- total:\t\t" + total);
	}

	public double gerarBalancoLoja() {
		return this.lucroLoja - this.despesaLoja;
	}

	public static double gerarBalancoTotal() {
		return lucroTotal - despesaTotal;
	}

	public double getLucroLoja() {
		return lucroLoja;
	}

	public void setLucroLoja(double lucroLoja) {
		this.lucroLoja = lucroLoja;
	}

	public static double getLucroTotal() {
		return lucroTotal;
	}

	public static void setLucroTotal(double lucroTotal) {
		Loja.lucroTotal = lucroTotal;
	}

	public double getDespesaLoja() {
		return despesaLoja;
	}

	public void setDespesaLoja(double despesaLoja) {
		this.despesaLoja = despesaLoja;
	}

	public static double getDespesaTotal() {
		return despesaTotal;
	}

	public static void setDespesaTotal(double despesaTotal) {
		Loja.despesaTotal = despesaTotal;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public String toString() {
		return "Loja [lucroLoja=" + lucroLoja + ", despesaLoja=" + despesaLoja + ", funcionarios=" + funcionarios
				+ ", produtos=" + produtos + "]";
	}

}
