
import java.util.Scanner;

public class MathOperaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Escribe un numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Escribe otro numero: ");
        int num2 = scanner.nextInt();

        double resultadopow = Math.pow(num1, num2);
        System.out.println(num1 + " elevado a " + num2 + " da: " + resultadopow);

        double resultadosqrt1 = Math.sqrt(num1);
        double resultadosqrt2 = Math.sqrt(num2);
        System.out.println("La raiz cuadrada de " + num1 + " es " + resultadosqrt1 + " y la de " + num2 + " es " + resultadosqrt2);

        double absoluto1 = Math.abs(num1);
        double absoluto2 = Math.abs(num2);
        System.out.println("El valor absoluto de " + num1 + " es " + absoluto1 + " y el de " + num2 + " es " + absoluto2);
        scanner.close();
    }
}
