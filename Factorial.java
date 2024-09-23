
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int num = scanner.nextInt();
        int resultado = 1;
        
        for (int i = 1; i <= num; i++) {
            resultado = resultado * i;
        }

        System.out.print(resultado);
        scanner.close();
    }
}
