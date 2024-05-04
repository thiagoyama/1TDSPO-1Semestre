package br.com.fiap.loja.model;

public class Produto {

    private int id;
    private String nome;
    private String descricao;
    private double preco;

    private float peso;

    public Produto(){}

    public Produto(int id, String nome, String descricao, double preco, float peso) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.peso = peso;
    }

    //Sobrecarga de métodos: métodos na mesma classe, com o mesmo nome e parametros diferentes
    public double calcularPrecoComDesconto(double porcentagem){
        return  preco - preco * porcentagem / 100;
    }

    public double calcularPrecoComDesconto(int quantidade){
        if (quantidade >= 5 && quantidade <= 9)
            return calcularPrecoComDesconto(10.0) * quantidade;
        if (quantidade > 9)
            return calcularPrecoComDesconto(20.0) * quantidade;
        return preco;
    }

    //FIAP25 dá 25% de desconto, FIAP40 dá 40% de desconto
    public double calcularPrecoComDesconto(String cupom){
        if (cupom.equals("FIAP25"))
            return calcularPrecoComDesconto(25.0);
        if (cupom.equals("FIAP40"))
            return calcularPrecoComDesconto(40.0);
        return preco;
    }

    public double calcularFrete(double distancia){
        if (preco > 250 && peso < 5 && distancia < 100)
            return 0;
        return 0.1 * peso + 0.2 * distancia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
