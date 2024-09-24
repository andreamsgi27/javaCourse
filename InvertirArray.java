public class InvertirArray {
    public static void main(String[] args) {
        int[] miarray = { 2, 7, 1, 3, 8, 1, 2 };
        int[] arrayinverso = new int[miarray.length];

        for (int i = 0; i < miarray.length; i++) {
            arrayinverso[miarray.length - 1 - i] = miarray[i];
        }
        for (int k = 0; k < arrayinverso.length; k++) {
            System.out.println(arrayinverso[k]);
        }
    }
}
