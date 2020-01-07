import java.util.Arrays;
import java.util.Scanner;

public class Main168 {
	public static boolean casoDePrueba(Scanner in) {
// Variable que controla si el caso hay que analizarlo o finalizar
		boolean continuar = true;
// Se lee la candidad de piezas o el caso especial que es 0

		int cantidad = in.nextInt();
// Si es el caso especial, no se ejecuta nada y continuar = false
		if (cantidad == 0)
			continuar = false;
		else {
// Declaración del array (tiene una pieza menos)
			int[] puzzle = new int[cantidad - 1];
// Lectura de las piezas del puzzle

			for (int i = 0; i < puzzle.length; i++) {
				puzzle[i] = in.nextInt();
			}
// Ordeno el Array
			Arrays.sort(puzzle);
// Proceso -> Busco la pieza perdida
			int pieza = 0;
// Puede ser la primera la que falta (si es diferente de 1)
// Puede ser la última la que falte (si es diferente de la cantidad)
// También puede falta una del medio
			// Este bucle primero busca primero el 1, luego el 2, etc... hasta la cantidad
			// introducida
			for (int i = 1; i <= cantidad; i++) {
				// He realizado una suposición y es que no encuentro la pieza perdida
				boolean piezaencontrada = false;
				for (int j = 0; j < puzzle.length; j++) {
					// Recorro el array buscando el valor "perdido"
					if (puzzle[j] == i) {
						// Si ya lo encuentro no sigo buscando
						piezaencontrada = true;
						break;
						// Sólo conocía Break en un "Switch". Sin poner break en el "if" no da error
						// Pero es necesario para salir del bucle. Podemos forzar la salida del bucle
						// igualando j a puzzle.lenght, pero esta manera me ha gustado más.
						// He tenido que buscar la información del break "if" por internet.
					}
				}

				// Si despues de recorrer todo el puzzle no he encontrado el valor buscado es la
				// pieza que falta
				if (!piezaencontrada) {
					pieza = i;
					break;
				}

			}
// Salida

			System.out.println(pieza);
		}
		return continuar;
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
// Casos de prueba limitado por un caso especial
		while (casoDePrueba(in))
			;
	}
}
