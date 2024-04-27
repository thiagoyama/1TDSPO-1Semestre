package br.com.fiap.exercicio.view;

import br.com.fiap.exercicio.model.Carro;
import br.com.fiap.exercicio.model.Cor;

public class View {

    public static void main(String[] args) {
        //Instanciar uma Cor
        Cor roxo = new Cor(120, 0, 55, "Roxo");

        //Instanciar um Carro
        Carro gol = new Carro("Gol", 5, 4.2, 2021,
                roxo, 5,"AN7DSA90", 1);

        //Exibir alguns dados do carro
        System.out.println(gol.getModelo() + " " + gol.getCor().getNome());

    }
}
