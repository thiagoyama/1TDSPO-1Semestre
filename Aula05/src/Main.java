import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String notaStr1 = JOptionPane.showInputDialog("Digite a nota 1");
        float nota1 = Float.parseFloat(notaStr1);

        float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2"));

        float media = (nota1 + nota2)/2;

        JOptionPane.showMessageDialog(null, "Média é " + media);

        //Exibir se o aluno passou ou não de ano
        //Acima de 6, passou de ano
        //Entre 4 e 5,9 Exame
        //Abaixo de 4, DP
        if (media >= 6){
            JOptionPane.showMessageDialog(null, "Parabéns! Você passou de ano");
        } else if (media < 6 && media >=4){
            JOptionPane.showMessageDialog(null, "Você tem uma chance! Está de exame");
        } else {
            JOptionPane.showMessageDialog(null, "Você está de DP =(");
        }

    }
}