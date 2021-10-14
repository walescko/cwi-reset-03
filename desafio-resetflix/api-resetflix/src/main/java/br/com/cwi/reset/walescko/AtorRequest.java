package br.com.cwi.reset.walescko;

import br.com.cwi.reset.walescko.mensagemExceptions.AtorAnoInicioAtividadeException;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AtorRequest {

    private String nome;
    private LocalDate dataNascimento;
    private StatusCarreira statusCarreira;
    private Integer anoInicioAtividade;

    public AtorRequest(String nome, LocalDate dataNascimento, StatusCarreira statusCarreira, Integer anoInicioAtividade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.statusCarreira = statusCarreira;
        this.anoInicioAtividade = anoInicioAtividade;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }


    public StatusCarreira getStatusCarreira() {
        return statusCarreira;
    }

    public Integer getAnoInicioAtividade() {
        return anoInicioAtividade;
    }


    public void Apresentacao() {
        System.out.println(this.nome);
        System.out.println(this.dataNascimento);
        System.out.println(this.statusCarreira);
        System.out.println(this.anoInicioAtividade);
    }


//    public void AnoInicioAtividade() throws AtorAnoInicioAtividadeException {
//        //LocalDate nascimento = Date.valueOf(dataNascimento);
//        SimpleDateFormat anoNascimento = new SimpleDateFormat("yyyy");
//        if (anoInicioAtividade < anoNascimento) {
//            throw new AtorAnoInicioAtividadeException();
//        }
//    }
}


