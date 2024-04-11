import javax.swing.*;

public class TesteTamanho {

    //Crie uma classe TesteTamanho em Java que peça o nome, a altura
    //e o peso de 2 pessoas e apresente o nome da mais pesada e o
    //nome da mais alta.
    public static void main(String[] args) {
        String nome1 = JOptionPane.showInputDialog("Digite o nome da primeira pessoa");
        float peso1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso da primeira pessoa"));
        float altura1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura da primeira pessoa"));

        String nome2 = JOptionPane.showInputDialog("Digite o nome da segunda pessoa");
        float peso2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso da segunda pessoa"));
        float altura2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura da segunda pessoa"));

        String maisPesado = "";
        if (peso1 > peso2) {
            maisPesado = "Maior peso: " + nome1;
        } else if (peso2 > peso1) {
            maisPesado = "Maior peso: " + nome2;
        } else {
            maisPesado = "As duas pessoas possuem o mesmo peso";
        }
        JOptionPane.showMessageDialog(null, maisPesado);

        if (altura1 > altura2)
            JOptionPane.showMessageDialog(null, "Mais alta: " + nome1);
        else if (altura2 > altura1)
            JOptionPane.showMessageDialog(null, "Mais alta: " + nome2);
        else
            JOptionPane.showMessageDialog(null, "As duas pessoas possuem a mesma altura");

    }
}
