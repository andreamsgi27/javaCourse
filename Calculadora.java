import java.util.Scanner;

public class Calculadora {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe 2 numeros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Que operacion quieres hacer? suma, resta, multi o div?");
        String operacion = scanner.nextLine();

        switch (operacion) {
            case "suma":
            System.out.println("La suma es: " + (num1+num2));
            break;

            case "resta":
            System.out.println("La resta es: " + (num1-num2));
            break;

            case "multi":
            System.out.println("La multiplicacion es: " + (num1*num2));
            break;

            case "div":
            System.out.println("La division es: " + (num1/num2));
            break;

            default:
            System.out.println("Error");
        }


        scanner.close();
    }
}