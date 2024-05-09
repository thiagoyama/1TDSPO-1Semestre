package br.com.fiap.loja.model;

public class Livro extends Produto {

    private String editora;
    private String genero;
    private String autores;

    public Livro(){}

    public Livro(int id, String nome, String descricao, double preco, float peso, String editora, String genero, String autores) {
        super(id, nome, descricao, preco, peso);
        this.editora = editora;
        this.genero = genero;
        this.autores = autores;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEditora: " + editora
                + "\nGenero: " + genero + "\nAutores: " + autores;
    }

    //Sobrescrever o método calcular desconto pela quantidade
    //Cinco livros ou mais: desconto de 15%
    @Override
    public double calcularPrecoComDesconto(int quantidade) {
        if (quantidade >= 5)
            return calcularPrecoComDesconto(15.0) * quantidade;
        return preco * quantidade;
    }

    //Sobrescrita do método calcular desconto com cupom
    //Adicionando o cupom FIAPLIVRO com 60%, os outros cupons tb funcionam
    @Override
    public double calcularPrecoComDesconto(String cupom) {
        if (cupom.equals("FIAPLIVRO"))
            return calcularPrecoComDesconto(60.0);
        return super.calcularPrecoComDesconto(cupom);
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }
}
