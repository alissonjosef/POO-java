import br.com.poo.dominio.*;

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

        /*System.out.println(curso);
        System.out.println(curso1);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setName("Bootcamp Java");
        bootcamp.setDescription("Bootcamp Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlisson = new Dev();
        devAlisson.setName("Alisson");
        devAlisson.inscreverBootcamp(bootcamp);
        System.out.println("Couteudo Inscritos Alisson" + devAlisson.getConteudoInscritos());
        devAlisson.progredir();
        devAlisson.progredir();
        devAlisson.progredir();
        System.out.println("=");
        System.out.println("Couteudo Inscritos Alisson" + devAlisson.getConteudoInscritos());
        System.out.println("Couteudo Concluidos Alisson" + devAlisson.getConteudoConcruidos());
        System.out.println("XP" + devAlisson.calcularTotalXp());


        System.out.println("=====");
        Dev devGih= new Dev();
        devGih.setName("Gih");
        devGih.inscreverBootcamp(bootcamp);
        System.out.println("Couteudo Concluidos gih" + devGih.getConteudoInscritos());
        devGih.progredir();
        System.out.println("=");
        System.out.println("Couteudo Concluidos gih" + devGih.getConteudoInscritos());
        System.out.println("Couteudo Concluidos gih" + devGih.getConteudoConcruidos());
        System.out.println("XP" + devAlisson.calcularTotalXp());

    }
}