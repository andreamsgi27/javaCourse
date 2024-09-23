public class Piramide {
    public static void main(String[] args) {
    int cateto = 10;

            for (int j = 0; j <= cateto; j++)
            {
                    for (int i = cateto; i <= cateto; i--)
                    {
                        System.out.println("");
                    }

                System.out.print("*");
                if (cateto == 0) { break; }
            }
            
        }
    }

