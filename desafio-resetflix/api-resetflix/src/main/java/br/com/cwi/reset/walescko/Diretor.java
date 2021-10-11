package br.com.cwi.reset.walescko;

import java.time.LocalDate;

public class Diretor extends Pessoa {

    private Integer id;

    public Diretor(String nome, LocalDate dataNascimento, LocalDate anoInicioAtividade, Integer id) {
        super(nome, dataNascimento, anoInicioAtividade);
        this.id = id;
    }
}