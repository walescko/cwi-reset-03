package br.com.cwi.reset.walescko;

import jdk.jshell.Snippet;

import java.time.LocalDate;

public class Ator extends Pessoa {

    private Integer id;
    private StatusCarreira statusCarreira;

    public Ator(String nome, LocalDate dataNascimento, LocalDate inicioAtividade, StatusCarreira statusCarreira, Integer id){
        super(nome, dataNascimento, inicioAtividade);
        this.statusCarreira = statusCarreira;
        this.id = id;
    }




}
