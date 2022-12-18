package programacaoEstruturada.Repeticao;

public class EstruturaRepeticao {
	
	public static void main(String[] args) {
		
		
		int contador = 1,somador=0;
		
		while(contador<=100) {
			somador+=contador;
			
			contador++;
		}
		
		System.out.println(somador);
	}

}
