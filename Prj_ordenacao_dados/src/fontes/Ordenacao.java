package fontes;

import java.util.Arrays;
import java.util.Random;

public class Ordenacao {
	public static void main(String[] args) {
		int []v = gerarVetor(40);
		int []w = removerDuplicados(v);
		
		System.out.println("Array aleatório:");
		System.out.println(Arrays.toString(v));
		bolha(w);
		removerDuplicados(v);
		System.out.println();
		System.out.println("Array ordenado e sem números repetidos:");
		System.out.println(Arrays.toString(w));
	}
	
	private static int[] gerarVetor(int tam) {
		int []vetor = new int[tam];
		Random gerador = new Random();
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = gerador.nextInt(100);
		}
		return vetor;
	}
	
	private static int[] removerDuplicados(int[] v) {
		int n =v.length;
		int []w = Arrays.copyOf(v, n);
		
		for (int i = 0; i < n; i++) {
			int k = i + 1;
			int removidos = 0;
			for (int j = i + 1; j < n; j++) {
				if (w[j] == w[i])
					removidos++;
				else
					w[k++] = w[j];
			}
			
			n = n - removidos;
		}		
		w = Arrays.copyOf(w, n);
		return w;
	}
	
	private static void bolha(int[] w) {
		//0(n *(n-1)) = 0(n²)
		for (int ultimo = w.length-1; ultimo > 0; ultimo--) {
			for (int i = 0; i < ultimo; i++)
				if (w[i] > w[i+1])
					trocar(w, i, i+1);
		}
	}
	private static void trocar(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;		
	}
	
}
