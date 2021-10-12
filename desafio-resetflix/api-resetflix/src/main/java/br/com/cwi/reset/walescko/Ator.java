package br.com.cwi.reset.walescko;

import jdk.jshell.Snippet;

import java.time.LocalDate;
import java.util.UUID;

public class AtorRequest extends Pessoa {

    private String id;
    private StatusCarreira statusCarreira;
    private String nome;

    public AtorRequest(String nome, LocalDate dataNascimento, LocalDate inicioAtividade, StatusCarreira statusCarreira, String id){
        super(nome, dataNascimento, inicioAtividade);
        this.statusCarreira = statusCarreira;
        id = UUID.randomUUID().toString();
        this.id = id ;
    }

    public String getNome() {
        return nome;
    }
}
