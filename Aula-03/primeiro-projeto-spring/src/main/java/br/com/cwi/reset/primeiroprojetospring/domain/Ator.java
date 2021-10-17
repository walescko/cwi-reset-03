package br.com.cwi.reset.primeiroprojetospring.domain;

import java.time.LocalDate;

public class Ator extends Pessoa {

    private Integer oscar;

    public Ator(String nome, LocalDate nascimento, Genero genero, Integer oscar) {
        super(nome, nascimento, genero);
        this.oscar = oscar;
    }
}
