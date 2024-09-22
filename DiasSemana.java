import java.util.Scanner;

public class DiasSemana {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero del 1 al 7: ");
        int dia = scanner.nextInt();

        switch (dia){
            case 1:
            System.out.println("El día " + dia + " corresponde al Lunes");
            break;

            case 2:
            System.out.println("El día " + dia + " corresponde al Mates");
            break;

            case 3:
            System.out.println("El día " + dia + " corresponde al Miércoles");
            break;

            case 4:
            System.out.println("El día " + dia + " corresponde al Jueves");
            break;

            case 5:
            System.out.println("El día " + dia + " corresponde al Viernes");
            break;

            case 6:
            System.out.println("El día " + dia + " corresponde al Sábado");
            break;

            case 7:
            System.out.println("El día " + dia + " corresponde al Domingo");
            break;

            default:
            System.out.println("Error");
        }


        scanner.close();
    }
}
