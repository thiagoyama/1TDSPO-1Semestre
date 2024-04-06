public class Conversoes {

    public static void main(String[] args) {
        //byte, short, int, long
        //float, double

        byte digito = 1;
        int digitoInt = digito;

        int numero = 1;
        byte numeroByte = (byte) numero; //cast, força o tipo de dado a ser o tipo escolhido

        float nota = 10;
        double notaDouble = nota;

        double preco = 5;
        float precoFloat = (float) preco;

    }
}
