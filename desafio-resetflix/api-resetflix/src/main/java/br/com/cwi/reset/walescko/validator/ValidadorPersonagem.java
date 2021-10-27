package br.com.cwi.reset.walescko.validator;

import br.com.cwi.reset.walescko.mensagemExceptions.IdNaoInformado;
import br.com.cwi.reset.walescko.mensagemExceptions.NomeNaoInformadoException;
import br.com.cwi.reset.walescko.request.PersonagemRequest;

import static java.util.Objects.isNull;

public class ValidadorPersonagem {

    public void accept(final PersonagemRequest personagemRequest) throws Exception{
        if (isNull(personagemRequest.getNomePersonagem())){
            throw new NomeNaoInformadoException();
        }

        if (isNull(personagemRequest.getDescricaoPersonagem())){
            throw new DescricaoPErsongagemNaoInformadoException();
        }

        if (isNull(personagemRequest.getIdAtor())){
            throw new IdNaoInformado();
        }
    }
}
