package br.com.cwi.reset.walescko.mensagemExceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EstudioNaoEncontratoFiltroException extends Exception{


    public EstudioNaoEncontratoFiltroException(final String campo){
        super(String.format("Estudio não encontrado com o filtro %s., favor informar outro filtro.", campo));
    }
}
