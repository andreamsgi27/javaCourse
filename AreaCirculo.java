import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14;
        System.out.print("Escribe el radio del circulo: ");
        double radio = scanner.nextDouble();
        System.out.print("El area del circulo es aprox: " + (pi * (radio*radio)));

        scanner.close();
    }
}