package br.com.cwi.reset.walescko.models;

import com.sun.jdi.IntegerValue;

import java.time.LocalDate;

public class Diretor {

    protected Integer id;
    protected String nome;
    protected LocalDate dataNascimento;
    protected Integer anoInicioAtividade;


    public Diretor(Integer id, String nome, LocalDate dataNascimento, Integer anoInicioAtividade) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.anoInicioAtividade = anoInicioAtividade;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Integer getAnoInicioAtividade() {
        return anoInicioAtividade;
    }
}