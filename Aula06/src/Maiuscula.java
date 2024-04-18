import javax.swing.*;

public class Maiuscula {

    public static void main(String[] args) {
        //Ler a String
        String palavra = JOptionPane.showInputDialog("Digite uma palavra");

        //Mostra a String em maiúsculo
        JOptionPane.showMessageDialog(null, palavra.toUpperCase());

    }
}
