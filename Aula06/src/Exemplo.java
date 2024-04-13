import javax.swing.*;

public class Exemplo {

    public static void main(String[] args) {
        //Ler uma senha
        String senha = JOptionPane.showInputDialog("Digite uma senha");

        //Validar se a senha possui mais do que 8 caracteres
        if (senha.length() > 8)
            JOptionPane.showMessageDialog(null, "Sua senha tem mais de 8 caracteres");
        else
            JOptionPane.showMessageDialog(null, "Sua senha possui 8 ou menos caracteres");

        //Ler uma hora e minutos (ex. "02:01") e transformar tudo em minutos, ex. são 121 minutos
        String tempo = JOptionPane.showInputDialog("Digite o tempo no formato (hh:mm)");

        //Forma 1
//        char h1 = tempo.charAt(0); //recupera o primeiro caractere da string (0)
//        char h2 = tempo.charAt(1); //recupera o segundo caractere da string (2)
//        int horas = Integer.parseInt(String.valueOf(h1) + String.valueOf(h2)); //transformar as horas que são string em inteiro
//
//        int minutos = Integer.parseInt(String.valueOf(tempo.charAt(3)) + String.valueOf(tempo.charAt(4)));
//
//        int total = horas * 60 + minutos;
//        JOptionPane.showMessageDialog(null, "Total em minutos: " + total);

        //Forma 2 (Permitir os padrões 1:11, 12:20)
        int posicaoDoDoisPontos = tempo.indexOf(":");
        String horasString = tempo.substring(0, posicaoDoDoisPontos); //Obtem a string do começo (incluindo) até a posição do : (excluindo)
        String minutosString = tempo.substring(posicaoDoDoisPontos + 1);

        int horas = Integer.parseInt(horasString);
        int minutos = Integer.parseInt(minutosString);
        int total = horas * 60 + minutos;
        JOptionPane.showMessageDialog(null, "Total em minutos: " + total);

    }
}
