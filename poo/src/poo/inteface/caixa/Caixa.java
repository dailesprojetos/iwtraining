package poo.inteface.caixa;

public class Caixa implements FormaPagamento {

	private double preco;
	private int qtdParcelas;
	private double valorParcelas;
	private double valorFinal;

	public Caixa() {
		
	}

	@Override
	public void pagamentoAVista(double preco) {
		double desconto = preco * 0.05; 
		double variacao = preco - desconto;
		
		this.qtdParcelas = 1;
		this.valorParcelas = variacao;
		this.valorFinal = variacao;
	}

	@Override
	public void pagamentoAVistaCartao(double preco) {
		this.qtdParcelas = 1;
		this.valorParcelas = preco;
		this.valorFinal = preco;
	}

	@Override
	public void parceladoTresVezes(double preco) {
		double acrescimo = preco * 0.08; 
		double variacao = preco + acrescimo;
		
		this.qtdParcelas = 3;
		this.valorParcelas = variacao/3;
		this.valorFinal = variacao;
	}
	
	
	public void parceladoTresVezes(double preco, int parcela) {
		double acrescimo = preco * 0.08; 
		double variacao = preco + acrescimo;
		
		this.qtdParcelas = parcela;
		this.valorParcelas = variacao/parcela;
		this.valorFinal = variacao;
	}
	

	@Override
	public void parceladoCincoVezes(double preco) {
		double acrescimo = preco * 0.15; 
		double variacao = preco + acrescimo;
		
		this.qtdParcelas = 5;
		this.valorParcelas = variacao/5;
		this.valorFinal = variacao;
	}
	
	public void parceladoCincoVezes(double preco, int parcela) {
		double acrescimo = preco * 0.15; 
		double variacao = preco + acrescimo;
		
		this.qtdParcelas = parcela;
		this.valorParcelas = variacao/parcela;
		this.valorFinal = variacao;
	}
	
	public void mostrarCompra() {
		
		System.out.println("=================Compra=================");
		System.out.println("preço: " + preco);
		System.out.println("quantidade parcelas: " + qtdParcelas);
		System.out.println("valor da parcela: " + (valorParcelas== valorFinal?" - ": valorParcelas));
		System.out.println("valor final: " + valorFinal);
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtdParcela() {
		return qtdParcelas;
	}

	public double getValorParcela() {
		return valorParcelas;
	}

	public double getPrecoFinal() {
		return valorFinal;
	}

}
