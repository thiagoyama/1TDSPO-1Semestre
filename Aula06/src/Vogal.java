import javax.swing.*;

public class Vogal {

    public static void main(String[] args) {
        String palavra = JOptionPane.showInputDialog("Digite uma palavra");

//        String resultado = palavra.replace("a", "*")
//                .replace("e", "*")
//                .replace("i", "*")
//                .replace("o", "*")
//                .replace("u","*");

        for (int i=0; i < palavra.length(); i++){
            char caractere = palavra.charAt(i);
            if ("aeiouAEIOU".indexOf(caractere)!= -1)
                palavra = palavra.replace(caractere, '*');
        }

        JOptionPane.showMessageDialog(null, palavra);
    }

}
