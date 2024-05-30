import br.com.poo.dominio.Curso;
import br.com.poo.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setDescricao("Programação Orientada a Objetos");
        curso.setCaraHoraria(40);

        Curso curso1 = new Curso();
        curso1.setTitulo("Código");
        curso1.setDescricao("Programação");
        curso1.setCaraHoraria(20);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Titulo");
        mentoria.setDescricao("Descricao  + curso1.getDescricao");
        mentoria.setDate(LocalDate.now());

        System.out.println(curso);
        System.out.println(curso1);
        System.out.println(mentoria);
    }
}