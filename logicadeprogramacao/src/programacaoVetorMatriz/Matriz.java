package programacaoVetorMatriz;

public class Matriz {

	public static void main(String[] args) {
		
		String sala[][] = {
				
							{"jose","da silva","bezerra de menezes","fortaleza"},
							{"larissa","dias","aldeota","fortaleza"},
							{"jessica","moura","meireles","fortaleza"},
							{"lucas","castro","bairro de fatima","fortaleza"}
						  };
		
		
		for (int indice = 0; indice < sala.length; indice++) {
			
			for (int i = 0; i < sala.length; i++) {
				System.out.print(sala[indice][i]+" ");
			}
			System.out.println();
		}
		
		System.out.println("===========================================");
		
		for (String[] linha : sala) {
			for (String coluna : linha) {
				System.out.print(coluna +" ");
			}
			System.out.println();
		}
		
		
		System.out.println("===========================================");
		
		String matriz[][] = new String[4][2];
		
		matriz[0][1] = "Carlos";
		matriz[0][2] = "Francisco";
		
		for (String[] linha : matriz) {
			for (String coluna : linha) {
				System.out.print(coluna +" ");
			}
			System.out.println();
		}

	}
	

}
