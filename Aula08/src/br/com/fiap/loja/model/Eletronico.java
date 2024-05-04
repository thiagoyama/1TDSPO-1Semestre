package br.com.fiap.loja.model;

public class Eletronico extends Produto {

    private String categoria;
    private int capacidadeBateria;
    private int armazenamento;
    private boolean garantia;

   public Eletronico(){}

    public Eletronico(int id, String nome, String descricao, double preco, float peso, String categoria, int capacidadeBateria, int armazenamento, boolean garantia) {
        super(id, nome, descricao, preco, peso);
        this.categoria = categoria;
        this.capacidadeBateria = capacidadeBateria;
        this.armazenamento = armazenamento;
        this.garantia = garantia;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public void setCapacidadeBateria(int capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public boolean isGarantia() {
        return garantia;
    }

    public void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }
}
