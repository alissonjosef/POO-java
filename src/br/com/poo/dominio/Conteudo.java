package br.com.poo.dominio;

import java.time.LocalDate;

public class Conteudo {

    protected static final double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;

    public double calcularXp() {
        return XP_PADRAO + 20;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
