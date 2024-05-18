package br.com.fiap.faculdade.model;

public class Tecnologo extends Formacao {

    private boolean planoEstendido;

    @Override
    public void definirDuracao() {
        duracao = 24;
    }

    public double calcularMensalidade(double fator){
        return mensalidade = getDuracao() * fator * 600;
    }

    public Tecnologo() {}

    public Tecnologo(String descricao, TipoPeriodo periodo, boolean planoEstendido) {
        super(descricao, periodo);
        this.planoEstendido = planoEstendido;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPlano Estendido: " + planoEstendido;
    }

    public boolean isPlanoEstendido() {
        return planoEstendido;
    }

    public void setPlanoEstendido(boolean planoEstendido) {
        this.planoEstendido = planoEstendido;
    }

}
