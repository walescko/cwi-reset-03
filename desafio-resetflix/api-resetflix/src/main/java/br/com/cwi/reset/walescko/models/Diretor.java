package br.com.cwi.reset.walescko.models;

import java.time.LocalDate;

public class Diretor {

    protected String id;
    protected String nome;
    protected LocalDate dataNascimento;
    protected LocalDate anoInicioAtividade;


    public Diretor(Integer id, String nome, LocalDate dataNascimento, LocalDate anoInicioAtividade) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.anoInicioAtividade = anoInicioAtividade;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public LocalDate getAnoInicioAtividade() {
        return anoInicioAtividade;
    }
}