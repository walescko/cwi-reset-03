package br.com.cwi.reset.walescko.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.time.LocalDate;

public class DiretorRequest {

    @NotNull(message = "Campo obrigatório não informado. Por Favor informe o nome do Diretor.")
    private String nome;
    @NotNull(message = "Campo obrigatório não informado. Por favor informe a data de nascimento.")
    @Past(message = "Pessoa nascida no futuro? Por favor verifique a data de nascimento.")
    private LocalDate dataNascimento;
    @NotNull(message = "Campo obrigatório não informado. Por favor informe o ano de início de atividade.")
    private Integer anoInicioAtividade;

    public DiretorRequest(String nome, LocalDate dataNascimento, Integer anoInicioAtividade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.anoInicioAtividade = anoInicioAtividade;
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
