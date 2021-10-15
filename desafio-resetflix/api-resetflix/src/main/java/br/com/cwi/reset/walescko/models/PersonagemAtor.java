package br.com.cwi.reset.walescko.models;

import br.com.cwi.reset.walescko.enums.TipoAtuacao;
import br.com.cwi.reset.walescko.models.Ator;

public class PersonagemAtor {

    private Integer id;
    private Ator ator;
    private String nomePersonagem;
    private TipoAtuacao tipoAtuacao;

    public PersonagemAtor(Integer id, Ator ator, String nomePersonagem, TipoAtuacao tipoAtuacao) {
        this.id = id;
        this.ator = ator;
        this.nomePersonagem = nomePersonagem;
        this.tipoAtuacao = tipoAtuacao;
    }
}
