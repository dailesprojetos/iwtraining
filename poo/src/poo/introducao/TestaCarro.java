package poo.introducao;

public class TestaCarro {
	
	public static void main(String[] args) {
		Carro c1 = new Carro();
		Carro generico = new Carro();
		
		c1.setMarca("bmw");
		c1.setModelo("z4");
		c1.setCor("preta");
		c1.setAno(2022);
		c1.setMotor("B58");
		c1.setQuantidadeDePortas(2);;
		c1.setValor(750_000);
		c1.setNovo(true);

		c1.acelerar();
		c1.nitro(80);
		
		/*System.out.println(c1.velocidade);
		c1.desacelarar();
		System.out.println(c1.velocidade);
		c1.parar();
		System.out.println(c1.velocidade);*/
		
		c1.buzinar();
		
		//System.out.println("velocidade do genérico: " + generico.velocidade);
		
		double velocidadeDoCarro = c1.velocimentro();
		System.out.println(velocidadeDoCarro);
		
		System.out.println(c1);
		
		System.out.println(c1.getMarca());
	}

}
