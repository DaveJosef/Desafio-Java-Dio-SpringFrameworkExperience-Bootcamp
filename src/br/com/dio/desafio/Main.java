package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {
        Curso conteudoPOO = new Curso();
        conteudoPOO.setTitulo("Curso de POO");
        conteudoPOO.setDescricao("Curso de POO com Java");
        conteudoPOO.setCargaHoraria(8);
        Mentoria conteudoNodeJS = new Mentoria();
        conteudoNodeJS.setTitulo("Mentoria de NodeJS");
        conteudoNodeJS.setDescricao("Mentoria de NodeJS com JavaScript");
        conteudoNodeJS.setData(LocalDate.now());

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.setConteudosInscritos(new LinkedHashSet<>(){{
            add(conteudoPOO);
            add(conteudoNodeJS);
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
