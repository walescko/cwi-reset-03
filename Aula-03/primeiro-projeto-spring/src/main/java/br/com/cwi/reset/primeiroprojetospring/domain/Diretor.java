package br.com.cwi.reset.primeiroprojetospring.domain;

import java.time.LocalDate;

public class Diretor extends Pessoa {

    private Integer filmesDirigidos;

    public Diretor(String nome, LocalDate nascimento, Genero genero, Integer filmesDirigidos) {
        super(nome, nascimento, genero);
        this.filmesDirigidos = filmesDirigidos;
    }
}
