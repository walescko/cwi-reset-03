package br.com.cwi.reset.walescko.validator;

import br.com.cwi.reset.walescko.enums.StatusAtividade;
import br.com.cwi.reset.walescko.mensagemExceptions.*;

import java.time.LocalDate;

public class ValidadorEstudio {

        public void accept(final String nome, final String descricao, final LocalDate dataCriacao, final StatusAtividade statusAtividade) throws Exception {
            if (nome == null) {
                throw new NomeNaoInformadoException();
            }

            if (dataCriacao == null) {
                throw new DataNascimentoNaoInformadoException();
            }


        }
}
