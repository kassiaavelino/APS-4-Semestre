package fontes;

import java.util.Arrays;
import java.util.Random;

public class teste_vetor_random {

	public static void main(String[] args) {
		int []v = gerarVetor(10);
		System.out.println(Arrays.toString(v));

	}
	
	private static int[] gerarVetor(int tam) {
		int []vetor = new int[tam];
		Random gerador = new Random();
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = gerador.nextInt(100);
		}
		
		return vetor;
	}

}
