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
