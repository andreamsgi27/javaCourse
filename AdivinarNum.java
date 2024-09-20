import java.util.Random;
import java.util.Scanner;

public class AdivinarNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomnum = random.nextInt(100);
        System.out.println("Adivina el número que estoy pensando: ");
        
        do { 
            int numintroducido = scanner.nextInt();
        } while (true);

        if (numintroducido == randomnum){
            System.out.println("Correcto!");

        }

        scanner.close();
    }
}
