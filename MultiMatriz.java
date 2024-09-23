public class MultiMatriz {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 4};
        int[] array2 = {9, 3, 6, 1};
        int multiplicacion;

        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array1.length; j++){
                    multiplicacion = array1[i] * array2[j];
                    System.out.println(multiplicacion);
            }
        }
        

    }
}
