import java.util.Scanner;

public class examen_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		final double PI = 3.14146;

		System.out.println("Ingresa el radio de la esfera: ");
		double radio = scanner.nextDouble();

		double volumen = (4.0 / 3.0) * PI * Math.pow(radio, 3);

		System.out.println("El volumen de la esfera con radio " + radio + " es: " + volumen);

		scanner.close();
	}
}	