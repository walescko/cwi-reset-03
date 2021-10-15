package br.com.cwi.reset.walescko.models;

import java.time.LocalDate;

public class Diretor {

    protected String id;
    protected String nome;
    protected LocalDate dataNascimento;
    protected LocalDate anoInicioAtividade;


    public Diretor(String nome, LocalDate dataNascimento, LocalDate anoInicioAtividade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.anoInicioAtividade = anoInicioAtividade;
        this.id = id;
    }
}