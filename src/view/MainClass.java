package view;

import javax.swing.JOptionPane;
import controller.ConverterController;

public class MainClass {
    public static void main(String[] args) {
        ConverterController controller = new ConverterController();

        int decimal;
        do {
            decimal = Integer.parseInt(JOptionPane.showInputDialog("Digite um número decimal (até 1000):"));
        } while (decimal < 0 || decimal > 1000);

        String binario = controller.decToBin(decimal);
        JOptionPane.showMessageDialog(null, "Binário: " + binario);
    }
}
;