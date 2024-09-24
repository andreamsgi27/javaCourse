import java.util.Random;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner (System.in);

        System.out.println("Que numero de caracteres quieres en tu contraseña?");
        int num = scanner.nextInt();
        char[] password = new char[num];
        
        for (int i = 0; i < password.length; i++){
            if (random.nextBoolean()) {
                password[i] = (char) ('0' + random.nextInt(10));
            } else {
                password[i] = (char) ('A' + random.nextInt(26));
            }
        }

        System.out.println("Tu contraseña generada es: " + new String(password));
        scanner.close();
    }
}
