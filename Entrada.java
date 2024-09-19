
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Escribe un numero: ");
            int num = scanner.nextInt();
            System.out.println("Tu número es: " + num);

            System.out.print("Escribe un numero con decimales (usando coma): ");
            float floatnum = scanner.nextFloat();
            System.out.println("Tu número es: " + floatnum);

            System.out.print("Escribe una palabra: ");
            String cadena = scanner.next();
            System.out.println("Tu palabra es: " + cadena);

            System.out.print("Escribe 2 números separados: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            System.out.println("La suma de los dos es: " + (num1 + num2));

            scanner.close();
    }
}
