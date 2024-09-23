
import java.util.Scanner;

public class CondicionesLogicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el número: ");
        int num = scanner.nextInt();

        if (num%2 == 0 && num > 0) {
            System.out.println("Es par y positivo");
        }

        if (num < 0 || num%3 == 0){
            System.out.println("Es negativo o divisible por 3");
        }
    }
}
