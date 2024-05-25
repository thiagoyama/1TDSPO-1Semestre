public class Main {

    public static void main(String[] args) {

        //Declarar um vetor de Frutas (String)
        String[] frutas = new String[4]; //4 Posições no vetor

        //Exibir o número de posições do vetor
        System.out.println("Tamanho do vetor: " + frutas.length);

        //Atribuir uma fruta na primeira posição do vetor
        frutas[0] = "Abacaxi";
        frutas[1] = "Pera";
        frutas[2] = "Morango";
        frutas[3] = "Limão";

        //Exibir o valor da primeira posição do vetor
        System.out.println("Primeiro elemento do vetor: " + frutas[3]);

        //Criar um vetor de notas com os valores 7, 4, 8
        float[] notas = {7, 4, 8, 10};

        //Exibir todas as notas
        //Laço de repetição para exibir as notas
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        //For each (variavel que recebe cada item do vetor : vetor)
        for (float churros : notas){
            System.out.println(churros);
        }

        //Exibir todas as frutas
        for (String f : frutas){
            System.out.println(f);
        }

    }
}