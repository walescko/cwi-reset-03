package br.com.cwi.reset.walescko.mensagemExceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NomePersonagemNaoInformado extends CampoNaoInformadoException{
    public NomePersonagemNaoInformado(){
        super("nome Personagem");
    }
}
