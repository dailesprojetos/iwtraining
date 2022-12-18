package poo.inteface.caixa;

public class TesteCaixa {

	public static void main(String[] args) {
		
		Caixa c01 = new Caixa();
		
		c01.setPreco(200);
		
		c01.pagamentoAVista(200);
		c01.mostrarCompra();
		
		c01.pagamentoAVistaCartao(200);
		c01.mostrarCompra();
		
		c01.parceladoTresVezes(200);
		c01.mostrarCompra();
		c01.parceladoTresVezes(300, 9);
		c01.mostrarCompra();
		
		c01.parceladoCincoVezes(200);
		c01.mostrarCompra();
		c01.parceladoCincoVezes(500, 7);
		c01.mostrarCompra();
		
	}

}
