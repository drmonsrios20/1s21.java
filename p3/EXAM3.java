import java.util.Scanner;
public class EXAM3{

    public static void main(String[] args) {
        int numTres = 3;
        int numCinco = 5;
        int residuo = 0;
        for (int n = 1; n <= 100; n++) {
            if ((n % numTres == residuo) && (n % numCinco == residuo)) {
                System.out.println("Blanco y Azul");
            } else if (n % numTres == residuo) {
                System.out.println("Blanco");
            } else if (n % numCinco == residuo) {
                System.out.println("Azul");
            } else {
                System.out.println(n);
            }
        }
    }
}