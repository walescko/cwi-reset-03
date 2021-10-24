package br.com.cwi.reset.projeto1.domain;

import java.time.LocalDate;

public class Diretor extends Person {
    private Integer quantidadeFilmes;

    public Diretor(String name, LocalDate nascimento, Integer quantidadeFilmes, Genero genero) {
        super(name, nascimento, genero);
        this.quantidadeFilmes = quantidadeFilmes;
    }

    public Integer getQuantidadeFilmes() {
        return quantidadeFilmes;
    }

    public String getName() {
    }
}
