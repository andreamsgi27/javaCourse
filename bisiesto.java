import java.util.Scanner;

public class bisiesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuántos días tiene este año? ");
        int year = scanner.nextInt();

        if (year == 365){
             System.out.println("No es bisiesto");
        } else if (year == 366){
            System.out.println("Si es bisiesto");
        } else {
            System.out.println("Error");
        }
    }
}