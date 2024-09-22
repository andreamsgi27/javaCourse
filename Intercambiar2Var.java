import java.util.Scanner;

public class Intercambiar2Var {
    public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa el primer valor: ");
    int a = scanner.nextInt();
    int b = a*2;
    System.out.println("a es: " + a * 2 + " cuando antes era: " + a);
    System.out.println("b es: " + b / 2 + " cuando antes era: " + b);
    
    //usando bit a bit XOR
    System.out.print("Ingresa el primer valor: ");
    int xor1 = scanner.nextInt();
    System.out.print("Ingresa el segundo valor: ");
    int xor2 = scanner.nextInt();
    xor1 = xor1 ^ xor2;
    xor2 = xor1 ^ xor2;
    xor1 = xor1 ^ xor2;
    System.out.println("Si lo intercambiamos, la primera: " + xor1 + " y la segunda: " + xor2);
    scanner.close();
}
}
