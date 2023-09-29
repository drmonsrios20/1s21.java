import java.util.Scanner;

public class examen_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Ingresa el valor de la resistencia (0 - 1000): ");
		double resistencia = input.nextDouble();
		System.out.println("Ingrese el valor de la intesidad: ");
		double intensidad = input.nextDouble();

		if (resistencia < 0) {
			System.out.println("Error: El valor de la resistencia no puede ser negativo.");
		} else if (resistencia > 1000) {
			System.out.println("Error: El valor de la resistencia es mayor que 1000.");
		} else {
			double caidaPotencial = intensidad * resistencia;

			System.out.println("La caida de potencial es: " + caidaPotencial + " v");
		}
		
		imput.close();		 
	}
}	