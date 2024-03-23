package br.com.fiap.seguros.view;

import br.com.fiap.seguros.model.Cliente;
import br.com.fiap.seguros.model.Veiculo;

public class Main {

    public static void main(String[] args) {
        //Instanciar um Cliente
        Cliente cliente = new Cliente("Eric", "123132132");

        System.out.println(cliente.getNome());

        //Instanciar o veiculo
        Veiculo veiculo = new Veiculo("ABC034S", "Corsa", "Amarelo", 1.6);

        //Instanciar um novo cliente com o nome, cpf e o veiculo
        Cliente theo = new Cliente("Theo", "23654564521", veiculo);

        //Exibir os dados do cliente
        System.out.println(theo.getNome() + " " + theo.getCpf());
        System.out.println(theo.getVeiculo().getModelo() + " " + theo.getVeiculo().getCor()
                                + " " + theo.getVeiculo().getPlaca() + " " + theo.getVeiculo().getMotor());

    }
}