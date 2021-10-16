package br.com.cwi.reset.primeiroprojetospring.domain;

public class Ator extends Pessoa {

    public Ator(String nome, Integer idade, Genero genero, Integer oscar) {
        super(nome, idade, genero);
        this.oscar = oscar;
    }
}
