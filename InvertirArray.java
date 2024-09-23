public class InvertirArray {
    public static void main(String[] args) {
        int[] miarray = { 2, 7, 1, 3, 8, 1, 2 };
        int[] arrayinverso = new int[miarray.length];

        for (int i = 0; i < miarray.length; i++) {
            for (int j = arrayinverso.length - 1; j >= 0; j--) {
                arrayinverso[j] = miarray[i];
                i++;
                break;
            }
        }

        for (int k = 0; k < arrayinverso.length; k++) {
            System.out.println(arrayinverso[k]);
        }
        
    }
}
