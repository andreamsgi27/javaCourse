
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListaDinamica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] listaArray = {1, 3, 5, 8};
        ArrayList list = new ArrayList<>(Arrays.asList(listaArray));

        System.out.println("Lista Original: ");

        for (Integer numero : listaArray) {
            System.out.println(numero);
        }

        System.out.println("Añade un número: ");
        list.add(scanner.nextInt());
        
        int suma;
        for (int i = 0; i < listaArray.length - 1; i++){
            suma = listaArray[i] + listaArray[i + 1];
        }
        
        System.out.println(suma);

        
        scanner.close();
    }
}
