package br.com.poo.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcruidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudoInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudoConcruidos.add(conteudo.get());
            this.conteudoInscritos.remove(conteudo.get());
        } else {
            System.err.println("Voce nãoe esta matriculado em Nenhum conteudo!");
        }
    }

    public double calcularTotalXp() {
        this.conteudoConcruidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Conteudo> getConteudoInscritos() {
        return conteudoInscritos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
    }

    public Set<Conteudo> getConteudoConcruidos() {
        return conteudoConcruidos;
    }

    public void setConteudoConcruidos(Set<Conteudo> conteudoConcruidos) {
        this.conteudoConcruidos = conteudoConcruidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dev dev)) return false;
        return Objects.equals(getName(), dev.getName()) && Objects.equals(getConteudoInscritos(), dev.getConteudoInscritos()) && Objects.equals(getConteudoConcruidos(), dev.getConteudoConcruidos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getConteudoInscritos(), getConteudoConcruidos());
    }
}
