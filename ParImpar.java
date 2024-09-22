
import java.util.Scanner;

public  class ParImpar {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe un numero: ");
        int num = scanner.nextInt();
        if (num % 2 == 0){
            System.out.print("El numero es par");
        } else {
            System.out.print("El numero es impar");
        }
        scanner.close();
    }
}
