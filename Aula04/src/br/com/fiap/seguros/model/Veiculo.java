package br.com.fiap.seguros.model;

public class Veiculo {

    private String placa;
    private String modelo;
    private String cor;
    private double motor;

    //Criar o construtor com todos os atributos
    public Veiculo(String placa, String modelo, String cor, double motor){
        this.cor = cor;
        this.modelo = modelo;
        this.placa = placa;
        this.motor = motor;
    }

    //Criar o construtor padrão
    public Veiculo(){}

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }
}
