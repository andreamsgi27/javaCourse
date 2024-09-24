public class Traspuesta {
    public static void main(String[] args) {
        int[][] bidimensional = {{1, 2, 3},{4, 5, 6}};
        int filas = bidimensional.length;
        int columnas = bidimensional[0].length;
        int[][] traspuesto = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                traspuesto[j][i] = bidimensional[i][j];
            }
        }

        for (int i = 0; i < traspuesto.length; i++) {
            for (int j = 0; j < traspuesto[i].length; j++) {
                System.out.print(traspuesto[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
