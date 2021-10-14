package br.com.cwi.reset.walescko;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Ator {

    protected String id;
    protected String nome;
    protected LocalDate dataNascimento;
    protected Integer anoInicioAtividade;
    protected StatusCarreira statusCarreira;

    public Ator(String nome, LocalDate dataNascimento, Integer anoInicioAtividade,
                StatusCarreira statusCarreira) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.anoInicioAtividade = anoInicioAtividade;
        this.statusCarreira = statusCarreira;
        id = UUID.randomUUID().toString();
        this.id = id;
    }

    public void AtorId(){
        id = UUID.randomUUID().toString();
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StatusCarreira getStatusCarreira() {
        return statusCarreira;
    }

    public void setStatusCarreira(StatusCarreira statusCarreira) {
        this.statusCarreira = statusCarreira;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
