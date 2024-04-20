package br.com.fiap.lavanderia.model;

public class Funcionario extends Pessoa {

    private String cargo;
    private double salario;

    public Funcionario(int id, String nome, String cpf, Endereco endereco, String cargo, double salario){
        super(id, nome, cpf, endereco); //Chamar o construtor do pai
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
