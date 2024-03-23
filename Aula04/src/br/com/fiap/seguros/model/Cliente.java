package br.com.fiap.seguros.model;

public class Cliente {

    private String nome;
    private Veiculo veiculo;
    private String cpf;

    public Cliente(){}

    public Cliente(String nome){
       this.nome = nome;
    }

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    //Criar um construtor com todos os atributos
    public Cliente(String nome, String cpf, Veiculo veiculo){
        this(nome, cpf); //chamando o construtor que recebe nome, cpf
        this.veiculo = veiculo;
    }

    //Getters e Setters
    //ALT + INSERT
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
