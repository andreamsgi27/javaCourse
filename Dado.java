import java.util.Random;
public class Dado {
    public static void main (String[] args){
        Random random = new Random();
        int randomnum = random.nextInt(1, 7);
        System.out.print("Tu dado marca: " + randomnum);
    }
}