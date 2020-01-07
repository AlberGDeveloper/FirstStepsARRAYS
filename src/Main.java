import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] numeros = { 1, 4, 9, 7, 3, 2, 5, 11, 0, 9 };
		int mitad = numeros.length / 2;
		for (int f = 0; f < mitad; f++) {

				int aux = numeros[f];
				numeros[f] = numeros[f + mitad];
				numeros[f + mitad] = aux;
			

		}

		System.out.print(Arrays.toString(numeros));

	}
}
