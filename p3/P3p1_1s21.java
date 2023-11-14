import java.util.Scanner;

public class P1_1S21_P3º{
	
	static Scanner teclado = new Scanner (System.in);
	
	public static void Suma (){
		System.out.println("Suma de dos numeros");
		System.out.println("Ingrese el primer numero");
		int a  = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		int b = teclado.nextInt();
		int c = a + b;
		System.out.println("la suma fue" + c);
	}
	public static void Resta (){
		System.out.println("Resta de dos numeros");
		System.out.println("Ingrese el primer numero");
		int a  = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		int b = teclado.nextInt();
		int c = a - b;
		System.out.println("la resta fue" + c);
	}
		public static void Multiplicacion (){
		System.out.println("Multiplicacion de dos numeros");
		System.out.println("Ingrese el primer numero");
		int a  = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		int b = teclado.nextInt();
		int c = a * b;
		System.out.println("la multiplicacion fue" + c);
	}
	public static void Division (){
		System.out.println("Division de dos numeros");
		System.out.println("Ingrese el primer numero");
		int a  = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		int b = teclado.nextInt();
		int c = a / b;
		System.out.println("la division fue" + c);
	}
	public static void menu(){
		System.out.println("Operaciones basicas");
		System.out.println("A) Suma");
		System.out.println("B) Resta");
		System.out.println("C) Multiplicacion");
		System.out.println("D) Division");
	}
	public static void	main(string[]args){
		menu();
		if(opc.equals("A"))Suma();
		if(opc.equals("B"))Resta();
		if(opc.equals("C"))Multiplicacion();
		if(opc.equals("D"))Divicion();
	}	

}