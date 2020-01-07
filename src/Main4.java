import java.util.Scanner;

public class Main4 {
	public static void casoDePrueba(Scanner in) {
// Array que contiene los d�as de cada mes del a�o
		int DaysMonth[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
// Lectura del d�a
		int day = in.nextInt();
// Lectura del mes
		int month = in.nextInt();
// Variable que contiene el total con el resultado
		int total = 0;
//Proceso -> Obt�n en total, la cantidad de d�as que faltan utilizando el array
		for (int i = month - 1; i < DaysMonth.length; i++) {
			total += DaysMonth[i];

		}
		total -= day;
//Salida
		System.out.println(total);
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
//Casos de prueba limitado
		int numCasos = Integer.parseInt(in.nextLine());
		for (int i = 0; i < numCasos; i++)
			casoDePrueba(in);

	}
}
