package programacaoEstruturada.Repeticao;

public class Fibonnacci {

	public static void main(String[] args) {
		
		long a = 1, b=0, c=0;
		
		for (long contador = 0; contador<=50; contador++) {
			c = a+b;
			a = b;
			b = c;
			System.out.println(c);
		}

	}

}
