
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListaDinamica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] listaArray = {1, 3, 5, 8};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(listaArray));

        System.out.println("Lista Original: ");

        for (Integer numero : listaArray) {
            System.out.print(numero + " ");
        }
        System.out.println();
        System.out.println("Añade un número: ");
        list.add(scanner.nextInt());
        
        int suma = 0;
        for (int i = 0; i < list.size(); i++){
            suma += list.get(i);
        }
        
        System.out.println("La suma de todos los números del array ahora es: " + suma);

        
        scanner.close();
    }
}
