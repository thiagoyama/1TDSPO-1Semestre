import javax.swing.*;

public class Menu {

    public static void main(String[] args) {
        //Calculadora: digite dois números e escolha a opção 1-somar 2-subtrair 3-multiplicar 4-dividir

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opção: 1-Somar 2-Subtrair 3-Multiplicar 4-Dividir"));

        switch (opcao){
            case 1:
                int soma = n1 + n2;
                JOptionPane.showMessageDialog(null, "A soma é " + soma);
                break;
            case 2:
                int subtracao = n1 - n2;
                JOptionPane.showMessageDialog(null, "A subtração é " + subtracao);
                break;
            case 3:
                int multiplicacao = n1 * n2;
                JOptionPane.showMessageDialog(null, "A multiplicação é " + multiplicacao);
                break;
            case 4:
                int divisao = n1 / n2;
                JOptionPane.showMessageDialog(null, "A divisão é " + divisao);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
        }

    }//main
}//class
