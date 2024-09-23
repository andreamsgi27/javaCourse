
import java.util.Scanner;

public class Votar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Que edad tienes? ");
        int edad = scanner.nextInt();

        if (edad >= 18){
            System.out.println("Puedes votar en las elecciones");
        } else {
            System.out.println("Aun no tienes la edad legal para votar");
        }
        scanner.close();
    }
}
