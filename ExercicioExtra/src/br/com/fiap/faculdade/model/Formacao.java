package br.com.fiap.faculdade.model;

//Classe abstrata -> não pode ser instanciada
// e pode conter métodos abstratos
public abstract class Formacao {

    protected String descricao;

    private TipoPeriodo periodo;

    protected double mensalidade;

    protected int duracao;

    public Formacao(String descricao, TipoPeriodo periodo) {
        this.descricao = descricao;
        this.periodo = periodo;
    }

    public Formacao() {}

    @Override
    public String toString() {
        return  "Descricao: " + descricao +
                "\nPeriodo: " + periodo +
                "\nMensalidade: " + mensalidade +
                "\nDuracao: " + duracao;
    }


    //Método abstrato -> sem implementação
    public abstract void definirDuracao();

    public double calcularMedia(double global1, double global2){
        return global1 * 0.4 + global2 * 0.6;
    }

    public double calcularMedia(double global1, double checkpoint1, double challenge1,
                                double global2, double checkpoint2, double challege2){
        double semestre1 = global1 * 0.6 + checkpoint1 * 0.2 + challenge1 * 0.2;
        double semestre2 = global2 * 0.6 + checkpoint2 * 0.2 + challege2 * 0.2;
        return semestre1 * 0.4 + semestre2 * 0.6;
    }

    public double calcularMedia(double cp1, double cp2, double cp3){
        double media = 0;
        if (cp1 >= cp2 && cp3 >= cp2){
            media = (cp1 + cp3) /2;
        } else if (cp1 >= cp3 && cp2 >= cp3){
            media = (cp1 + cp2) / 2;
        } else {
            media = (cp2 + cp3) / 2;
        }
        return media;
    }

    //Getters e Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoPeriodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(TipoPeriodo periodo) {
        this.periodo = periodo;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public int getDuracao() {
        return duracao;
    }

}
