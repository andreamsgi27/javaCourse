
import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog(null, "Ingresa tu nombre: ");
        JOptionPane.showMessageDialog(null, "Hola, " + nombre);
    }
}
