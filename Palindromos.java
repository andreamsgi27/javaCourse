
import java.util.Scanner;

public class Palindromos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe una palabra: ");
        String palabra = scanner.nextLine();
        char [] palabraArray = palabra.toCharArray();
        char [] palabraInversa = new char[palabraArray.length];

        for (int i = 0; i < palabraArray.length; i++) {
            palabraInversa[palabraArray.length - 1 - i] = palabraArray[i];
        }
        
        boolean esPalindromo = true;
        for (int i = 0; i < palabraArray.length; i++) {
            if (palabraArray[i] != palabraInversa[i]) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }

        scanner.close();
    }
}
