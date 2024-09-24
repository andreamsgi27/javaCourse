
import java.util.Scanner;

public class VerificarVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe una palabra: ");
        String palabra = scanner.nextLine();
        char [] palabraArray = palabra.toCharArray();
        int conteo = 0;


        for (int i = 0; i < palabraArray.length; i++) {
            if (palabraArray[i] == 'a' || palabraArray[i] == 'e' || palabraArray[i] == 'i' || palabraArray[i] == 'o' || palabraArray[i] == 'u'){
                conteo++;
            }
        }

        System.out.println("La palabra tiene " + conteo + " vocales");

        scanner.close();
    }
}
