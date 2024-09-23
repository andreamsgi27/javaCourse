import java.util.Random;
public class Dado {
    public static void main (String[] args){
        Random random = new Random();
        int randomnum = random.nextInt(1, 7);
        int randomnum2 = random.nextInt(1, 7);
        System.out.print("Un dado marca: " + randomnum + " y el otro: " + randomnum2);
    }
}