import java.util.Scanner;

public class Main2 {
	int[] notas;
	Scanner sc;

	public void pedirNotas(int cantidad) {
		sc = new Scanner(System.in);
		notas = new int[cantidad];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Introduzca la nota del alumno %d: ", i + 1);
			notas[i] = sc.nextInt();
		}
	}

	/*
	 * TODO: Programa este método para que calcule la diferencia entre la nota mas
	 * alta y la mas baja
	 */
	public void calcularDiferencia() {
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] > mayor)
				mayor = notas[i];
			
			if (notas[i] < menor)
				menor = notas[i];
		}
		
		int diff = mayor - menor;
		
		System.out.printf("La diferencia es: %d", diff);
	}

	public static void main(String[] args) {
		Main2 ejemplo = new Main2();
// Averigua cómo introducir un número en args[0] desde eclipse
// Entiendo que tenemos que editar los argumentos desde RUN/ Run configurations/Arguments.
// He puesto 1 2 3 y me pide 3 notas
		int elementos = Integer.parseInt(args[0]);
		ejemplo.pedirNotas(elementos);
		ejemplo.calcularDiferencia();
	}
}