import java.util.Random;
import java.util.Scanner;

public class AdivinarNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomnum = random.nextInt(100);
        System.out.println("Adivina el número que estoy pensando: ");
        int numintroducido = scanner.nextInt();

        do { 
            numintroducido = scanner.nextInt();

            if (numintroducido > randomnum){
                System.out.println("El numero es menor!");
            } else {
                System.out.println("El numero es mayor!");
            }
        } while (numintroducido != randomnum);

        System.out.println("Correcto!");

        scanner.close();
    }
}
