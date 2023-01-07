package heranca.inteface.implementacao;

public class CalculoTemperatura {

	public static void main(String[] args) {
		
		CalculoGraus calculoFahrenheit = (x) -> (x*9/5)+32;
		CalculoGraus kelvin = (x) -> x + 273;
		
		System.out.println(calculoTemperatura(kelvin, 100));
		System.out.println(calculoTemperatura(calculoFahrenheit, 100));

	}
	
	public static double calculoTemperatura(CalculoGraus e, double celsius) {
		return e.temperatura(celsius);
	}	

}
