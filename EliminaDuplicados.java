import java.util.ArrayList;
import java.util.Arrays;

public class EliminaDuplicados {
    public static void main(String[] args) {
            String[] array = { "Manzana", "Pera", "Manzana", "Nutella", "Pera"};
            ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));

            System.out.println("Lista original: " + arrayList);

            for (int i = 0; i < arrayList.size(); i++)
            {
                for (int j = i + 1; j < arrayList.size(); j++)
                {
                    if (arrayList.get(j).equals(arrayList.get(i)))
                    {
                        arrayList.remove(j);
                    }
                }
            }

            System.out.println("Después de eliminar duplicados: " + arrayList);
        }
}
