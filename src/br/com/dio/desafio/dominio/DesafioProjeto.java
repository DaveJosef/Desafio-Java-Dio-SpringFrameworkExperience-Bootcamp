package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.Set;

public class DesafioProjeto extends Conteudo {

    private int dificuldade;
    private Set<String> tags = new HashSet<>();

    @Override
    public double calcularXp() {
        return XP_PADRAO * dificuldade + 100D;
    }

    public DesafioProjeto() {
    }

    public DesafioProjeto(Set<String> tags) {
        this.tags = tags;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    @Override
    public String toString() {
        return "DesafioProjeto{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", dificuldade='" + dificuldade + '\'' +
                ", tags=" + tags +
                '}';
    }
}
