package br.com.cwi.reset.walescko.request;

import br.com.cwi.reset.walescko.enums.StatusCarreira;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.time.LocalDate;

public class AtorRequest {

    @NotNull(message = "Campo obrigatório não informado. Por favor informar o nome")
    private String nome;
    @NotNull(message = "Campor obrigatório não informado. Por favor informar a data de nascimento.")
    @Past(message = "Pessoas nascida no futuro? Por Favor, verifique a data de nascimento.")
    private LocalDate dataNascimento;
    @NotNull(message = "Informar o estadus de Carreira do Ator.")
    private StatusCarreira statusCarreira;
    @NotNull(message = "Campo obrigatório não informado, Por favor, informe o ano de inicio de atividade.")

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

    public LocalDate getDataNascimento() { return dataNascimento;}

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
}


