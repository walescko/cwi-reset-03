package br.com.cwi.reset.walescko.mensagemExceptions;

public class CampoNaoInformadoException extends Exception {

    public CampoNaoInformadoException(final String campo){
        super(String.format("Campo obrigatório não informado. Favor informar o campo %.", campo));
    }
}
