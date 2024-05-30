package br.com.poo.dominio;

public class Curso {

    private String titulo;
    private String descricao;
    private int CaraHoraria;

     public Curso() {
          this.titulo = titulo;
          this.descricao = descricao;

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

     public int getCaraHoraria() {
          return CaraHoraria;
     }

     public void setCaraHoraria(int caraHoraria) {
          CaraHoraria = caraHoraria;
     }

     @Override
     public String toString() {
          return "Curso{" +
                  "titulo='" + titulo + '\'' +
                  ", descricao='" + descricao + '\'' +
                  ", CaraHoraria=" + CaraHoraria +
                  '}';
     }
}
