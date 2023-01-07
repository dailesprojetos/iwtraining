package heranca.inteface.implementacao;

public class AreaTeste {

	public static void main(String[] args) {
		
		CalculoArea triangulo = (x) -> { return Math.pow(x, 2) * Math.sqrt(3)/4; };   
		
		CalculoArea quadrado = x -> Math.pow(x, 2);
		
		CalculoArea pentagono = x -> 5 * Math.pow(x, 2) / 4 * Math.tan(36);
		
		CalculoArea hexagono = x -> 3 * Math.pow(x, 2) * (Math.sqrt(3)/2);

	}
	
	public static double calculoArea(CalculoArea e, int lado) {
		return e.areaCalculada(lado);
	}	

}
