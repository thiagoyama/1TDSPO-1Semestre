package br.com.fiap.faculdade.model;

public class Medio extends Formacao {

    private String tipo;

    @Override
    public void definirDuracao() {
        duracao = 36;
    }

    public double calcularMensalidade(double fator){
        return mensalidade = getDuracao() * fator * 500;
    }

    public Medio() {}

    public Medio(String descricao, TipoPeriodo periodo, String tipo) {
        super(descricao, periodo);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo: " + tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
