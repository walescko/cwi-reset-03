package br.com.cwi.reset.walescko.validator;

import br.com.cwi.reset.walescko.mensagemExceptions.*;

import java.time.LocalDate;

public class Validador {


    public void accept(final String nome, final LocalDate dataNascimento, final Integer anoInicioAtividade, final TipoDominioException tipoDominioException) throws Exception {
        if (nome.split(" ").length < 2) {
            throw new NomeSobrenomeObrigatorioException(tipoDominioException.getSingular());
        }
    }
}
