package br.com.cwi.reset.walescko.request;

import br.com.cwi.reset.walescko.enums.StatusAtividade;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.time.LocalDate;

public class EstudioRequest {
    @NotNull(message = "Campo obrigatório não informado. Por favor, informe o nome do Estudio.")
    private String nome;
    @NotNull(message = "Campo obrigatório não informado. Por favor, informe a descroção do Estudio.")
    private String descricao;
    @NotNull(message = "Campo obrigatório não informado. Por favor, informe o ano de criação do Estudio.")
    @Past(message = "Verifique a data de criação do estúdio." )
    private LocalDate dataCriacao;
    @NotNull(message = "Campo obrigatório não informado. Por favor, informe o status de atividadesdo Estudio.")
    private StatusAtividade statusAtividade;

    public EstudioRequest(String nome, String descricao, LocalDate dataCriacao, StatusAtividade statusAtividade) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.statusAtividade = statusAtividade;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public StatusAtividade getStatusAtividade() {
        return statusAtividade;
    }
}
