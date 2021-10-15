package br.com.cwi.reset.walescko.request;

import java.time.LocalDate;

public class DiretorRequest {

    private String nome;
    private LocalDate dataNascimento;
    private Integer anoInicioAtividade;

    public DiretorRequest(String nome, LocalDate dataNascimento, Integer anoInicioAtividade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.anoInicioAtividade = anoInicioAtividade;
    }
}
