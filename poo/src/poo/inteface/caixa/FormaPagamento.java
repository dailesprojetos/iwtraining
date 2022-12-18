package poo.inteface.caixa;

public interface FormaPagamento {
	
	public void pagamentoAVista(double preco);
	public void pagamentoAVistaCartao(double preco);
	public void parceladoTresVezes(double preco);
	public void parceladoCincoVezes(double preco);

}
