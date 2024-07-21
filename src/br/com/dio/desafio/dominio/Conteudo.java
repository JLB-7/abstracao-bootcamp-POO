package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    //atributos
    private String titulo;
    private String descricao;

    protected static final double XP_PADRAO = 10d;

    public abstract double calcularXp();

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}

