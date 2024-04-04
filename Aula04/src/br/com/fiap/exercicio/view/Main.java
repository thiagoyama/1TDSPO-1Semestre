package br.com.fiap.exercicio.view;

import br.com.fiap.exercicio.model.Funcionario;
import br.com.fiap.exercicio.model.Profissao;

public class Main {

    public static void main(String[] args) {
        //Instanciar uma Profissao
        Profissao medico = new Profissao("Médico Pediatra");

        //Instanciar um Funcionario
        Funcionario func = new Funcionario(1231, "Carlos Silva", medico);
        func.setSalario(5000);

        //Exibir os dados do funcionario
        System.out.println(func.exibirDados());
    }

}
