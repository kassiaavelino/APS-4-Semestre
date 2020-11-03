package fontes;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		int []v = {55, 35, 45, 70, 22, 10, 2, 14, 28, 89};
		bolha(v);
		
		System.out.println(Arrays.toString(v));
	}

	private static void bolha(int[] v) {
		//0(n *(n-1)) = 0(n²)
		for (int ultimo = v.length-1; ultimo > 0; ultimo--) {
			for (int i = 0; i < ultimo; i++)
				if (v[i] > v[i+1])
					trocar(v, i, i+1);
		}
	}

	private static void trocar(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
		
	}
	
}
