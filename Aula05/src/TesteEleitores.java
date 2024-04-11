import javax.swing.*;

public class TesteEleitores {

    public static void main(String[] args) {

        for (int churros = 0; churros < 3; churros++) {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));

            if (idade < 16) {
                JOptionPane.showMessageDialog(null, "Não eleitor");
            } else if (idade >= 18 && idade <= 65) {
                JOptionPane.showMessageDialog(null, "Eleitor Obrigatório");
            } else {
                JOptionPane.showMessageDialog(null, "Eleitor facultativo");
            }
        }
    }
}
