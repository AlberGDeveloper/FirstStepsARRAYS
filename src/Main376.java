import java.util.Scanner;

public class Main3 {
	public static boolean casoDePrueba(Scanner in) {
// Variable que controla si el caso hay que analizarlo o finaliar
		boolean continuar = true;
// Se lee la candidad de piezas o el caso especial que es 0
		int cantidad = in.nextInt();
// Si es el caso especial, no se ejecuta nada y continuar = false
		if (cantidad == 0)
			continuar = false;
		else {
// Declaración del array con las alturas de las montañas
			int[] alturas = new int[cantidad];
// Lectura de las cotas (diferentes alturas)
			for (int i = 0; i < alturas.length; i++) {
				alturas[i] = in.nextInt();
			}
// Proceso -> Búsqueda de picos
			int picos = 0;
// Caso cicular 1: El primero debe ser mayor que el último y mayor que el segundo
			if (alturas[0] > alturas[alturas.length - 1] && alturas[0] > alturas[1])
				picos++;
// Caso ciruclar 2: El último debe ser mayor que el anterior y mayor que el primero
			if (alturas[alturas.length - 1] > alturas[alturas.length - 2] && alturas[alturas.length - 1] > alturas[0])
				picos++;

// Casos intermedios
			for (int i = 1; i < alturas.length - 1; i++) {
				if (alturas[i] > alturas[i - 1] && alturas[i] > alturas[i + 1])
					picos++;
			}

// Salida
			System.out.println(picos);
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