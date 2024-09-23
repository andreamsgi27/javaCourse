import javax.swing.JOptionPane;

public class CalculadoraGUI {
    public static void main(String[] args) {
        String numString1 = JOptionPane.showInputDialog(null, "Introduce un número: ");
        int num1 = Integer.parseInt(numString1);

        String[] arrayBotones = {"+", "-", "*", "/"};
        int botones = JOptionPane.showOptionDialog(null, "¿Que operación quieres realizar?", "Calculadora", JOptionPane.DEFAULT_OPTION,  JOptionPane.INFORMATION_MESSAGE, null, arrayBotones, arrayBotones[0]);

        String numString2 = JOptionPane.showInputDialog(null, "Introduce otro número: ");
        int num2 = Integer.parseInt(numString2);

        switch (botones){
            case 0:
                JOptionPane.showMessageDialog(null, num1 + num2);
                break;
            case 1:
                JOptionPane.showMessageDialog(null, num1 - num2);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, num1 * num2);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, num1 / num2);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error");
                break;

        }
    }
}
