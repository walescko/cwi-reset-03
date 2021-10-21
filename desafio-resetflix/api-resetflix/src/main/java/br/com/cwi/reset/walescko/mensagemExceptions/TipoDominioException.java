package br.com.cwi.reset.walescko.mensagemExceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public enum TipoDominioException {

    ATOR("ator", "atores"),
    DIRETOR("diretor", "diretores"),
    ESTUDIO("estudio", "estudios");

    private final String singular;
    private final String plural;

    TipoDominioException(final String singular, final String plural) {
        this.singular = singular;
        this.plural = plural;
    }

    public String getSingular() {
        return singular;
    }

    public String getPlural() {
        return plural;
    }

}
