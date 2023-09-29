import java.util.Scanner;

public class examen_7 {
	public static void main(String[] args) {
		Scanner imput = new Scanner(System.in);

		System.out.println("Ingrese el valor a: "),
		double a = input.nextDouble();
		System.out.println("Ingrese el valor b: ");
		double b = input.nextDouble();
		System.out.println("Ingrese el valor c: ");
		double c = input.nextDouble();
		System.out.println("Ingrese el valor d: ");
		double d = input.nextDouble();
		System.out.println("Ingrese el valor e: ");
		double e = input.nextDouble();
		System.out.println("Ingrese el valor f: ");
		double f = input.nextDouble();
		double divisor = a * e - b * d;

		if (divisor == 0) {
			System.out.println("El sistema de ecuaciones no tiene solucion, ya que el divisor es igual a cero.");
			} else {

				double x = (c * e - b * f) / divisor;
				double y = (a * f - c * d) / divisor;

				System.out.println("La solucion del sistema de ecuaciones es: ");
				System.out.println("x = " + x);
				System.out.println("y = " + y);
			}
			
			input.close();	
	}
}	