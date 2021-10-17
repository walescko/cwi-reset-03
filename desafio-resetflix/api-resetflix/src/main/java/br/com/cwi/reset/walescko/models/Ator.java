package br.com.cwi.reset.walescko.models;

import br.com.cwi.reset.walescko.enums.StatusCarreira;

import java.time.LocalDate;
import java.util.UUID;

public class Ator {

    protected Integer id;
    protected String nome;
    protected LocalDate dataNascimento;
    protected Integer anoInicioAtividade;
    protected StatusCarreira statusCarreira;

    public Ator(Integer id, String nome, LocalDate dataNascimento, Integer anoInicioAtividade,
                StatusCarreira statusCarreira) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.anoInicioAtividade = anoInicioAtividade;
        this.statusCarreira = statusCarreira;
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

    public StatusCarreira getStatusCarreira() {
        return statusCarreira;
    }


}
