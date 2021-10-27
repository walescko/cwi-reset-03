package br.com.cwi.reset.walescko.mensagemExceptions;

import br.com.cwi.reset.walescko.enums.TipoAtuacao;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class TipoAtuacaoInformadoException extends CampoNaoInformadoException {
    public TipoAtuacaoDominioException() {
        super("tipoAtuacao");
    }
}