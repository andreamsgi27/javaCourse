import java.util.Scanner;

public class TablaMultiFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
    int[] tabla1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] tabla2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
    int[] tabla3 = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
    int[] tabla4 = {4, 8, 12, 16, 20, 24, 28, 32, 36, 40};
    int[] tabla5 = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
    int[] tabla6 = {6, 12, 18, 24, 30, 36, 42, 48, 54, 60};
    int[] tabla7 = {7, 14, 21, 28, 35, 42, 49, 56, 63, 70};
    int[] tabla8 = {8, 16, 24, 32, 40, 48, 56, 64, 72, 80};
    int[] tabla9 = {9, 18, 27, 36, 45, 54, 63, 72, 81, 90};

    System.out.println("Ingrese el numero de la tabla que quieres imprimir: ");
    int tablaintroducida = scanner.nextInt();
    
    switch(tablaintroducida){
        case 1:
        for (int i = 0; i < tabla1.length; i++){
            System.out.println(tabla1[i]);
        }
        break;

        case 2:
        for (int i = 0; i < tabla2.length; i++){
            System.out.println(tabla2[i]);
        }
        break;

        case 3:
        for (int i = 0; i < tabla3.length; i++){
            System.out.println(tabla3[i]);
        }
        break;

        case 4:
        for (int i = 0; i < tabla4.length; i++){
            System.out.println(tabla4[i]);
        }
        break;

        case 5:
        for (int i = 0; i < tabla5.length; i++){
            System.out.println(tabla5[i]);
        }
        break;

        case 6:
        for (int i = 0; i < tabla6.length; i++){
            System.out.println(tabla6[i]);
        }
        break;

        case 7:
        for (int i = 0; i < tabla7.length; i++){
            System.out.println(tabla7[i]);
        }
        break;

        case 8:
        for (int i = 0; i < tabla8.length; i++){
            System.out.println(tabla8[i]);
        }
        break;

        case 9:
        for (int i = 0; i < tabla9.length; i++){
            System.out.println(tabla9[i]);
        }
        break;

        default:
        System.out.println("Error");
    }
}
}
