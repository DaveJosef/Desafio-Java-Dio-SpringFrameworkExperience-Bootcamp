package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Dev;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.setConteudosInscritos(new LinkedHashSet<>(){{
            add("Curso de POO");
            add("Curso de NodeJS");
        }});

        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();

        System.out.println("_");

        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());
    }

}
