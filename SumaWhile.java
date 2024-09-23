
import java.util.Scanner;

public class SumaWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int num = scanner.nextInt();
        
        int conteo = 0;
        int suma = 0;

        while (conteo <= num) {
            suma = suma + conteo;
            conteo++;
        }

        System.out.print(suma);
        scanner.close();
    }
}
