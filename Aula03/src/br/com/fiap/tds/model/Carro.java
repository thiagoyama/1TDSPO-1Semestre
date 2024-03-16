package br.com.fiap.tds.model;

public class Carro {

    //Atributos encapsulados
    private String placa;
    private String cor;
    private String modelo;
    private boolean eletrico;
    private int ano;

    //Métodos Getters e Setters
    //No IntelliJ IDEA: ALT + INSERT (Getters e Setters)
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setEletrico(boolean eletrico){
        this.eletrico = eletrico;
    }

    //Get para boolean -> getAtributo ou isAtributo
    public boolean isEletrico(){
        return eletrico;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getPlaca(){
        return placa;
    }
}
