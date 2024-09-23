
public class NumMayor {
    public static void main(String[] args) {
        int[] miarray = { 2, 7, 1, 3, 8, 1, 2 };
        int numeromasgrande = 0;

        for (int i = 0; i < miarray.length; i++){

                if (miarray[i] > numeromasgrande)
                {
                    numeromasgrande = miarray[i];

                    if (numeromasgrande > miarray[i + 1])
                    {
                        miarray[i] = numeromasgrande;
                    }
                }
        }
        
        System.out.println(numeromasgrande);
    }
}
