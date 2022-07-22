package br.com.dio.desafio;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println("Conteúdos Inscritos Camila:" + getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + getConteudosConcluidos());
        System.out.println("XP:" + calcularTotalXp());
    }

    private static double calcularTotalXp() {
        return 0D;
    }

    private static Set<String> getConteudosConcluidos() {
        return new HashSet<>();
    }

    private static Set<String> getConteudosInscritos() {
        return new HashSet<>();
    }
}
