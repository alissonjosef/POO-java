package br.com.poo.dominio;

public class Curso extends Conteudo{

    private int caraHoraria;

     public Curso() {

     }

    @Override
    public double calcularXp() {
        return XP_PADRAO * caraHoraria;
    }

     public int getCaraHoraria() {
          return caraHoraria;
     }

     public void setCaraHoraria(int caraHoraria) {
          this.caraHoraria = caraHoraria;
     }

     @Override
     public String toString() {
          return "Curso{" +
                  "titulo='" + getTitulo() + '\'' +
                  ", descricao='" + getDescricao() + '\'' +
                  ", CaraHoraria=" + caraHoraria + '\'' + calcularXp() + '\'' +
                  '}';
     }
}
