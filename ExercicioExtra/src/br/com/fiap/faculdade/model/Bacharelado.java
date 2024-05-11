package br.com.fiap.faculdade.model;

public class Bacharelado extends Formacao {

    private String projetoConclusao;

    private int cargaHorariaEstagio;

    public double calcularMensalidade(double fator){

    }

    public Bacharelado() {}

    public Bacharelado(String descricao, int periodo, double mensalidade, int duracao, String projetoConclusao, int cargaHorariaEstagio) {
        super(descricao, periodo, mensalidade, duracao);
        this.projetoConclusao = projetoConclusao;
        this.cargaHorariaEstagio = cargaHorariaEstagio;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nProjeto Conclusão: " + projetoConclusao +
                "\nCarga Horaria Estagio: " + cargaHorariaEstagio;
    }

    public String getProjetoConclusao() {
        return projetoConclusao;
    }

    public void setProjetoConclusao(String projetoConclusao) {
        this.projetoConclusao = projetoConclusao;
    }

    public int getCargaHorariaEstagio() {
        return cargaHorariaEstagio;
    }

    public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
        this.cargaHorariaEstagio = cargaHorariaEstagio;
    }
}
