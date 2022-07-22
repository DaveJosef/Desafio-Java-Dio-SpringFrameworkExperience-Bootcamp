package br.com.dio.desafio.dominio;

import java.util.*;
import java.util.function.ToDoubleFunction;

public class Dev {

    private String nome;
    private Set<String> conteudosInscritos = new LinkedHashSet<>();
    private Set<String> conteudosConcluidos = new LinkedHashSet<>();

    public void progredir() {
        Optional<String> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXp() {/*
        Iterator<String> iterator = this.conteudosConcluidos.iterator();
        double soma = 0;
        while (iterator.hasNext()) {
            soma += 20D;
        }
        return soma;*/

        return this.conteudosConcluidos.stream().mapToDouble(s -> 20D).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<String> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<String> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<String> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<String> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) &&
                Objects.equals(conteudosInscritos, dev.conteudosInscritos) &&
                Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
