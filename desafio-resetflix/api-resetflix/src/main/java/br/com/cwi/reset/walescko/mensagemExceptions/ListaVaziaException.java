package br.com.cwi.reset.walescko.mensagemExceptions;

public class ListaVaziaException extends Exception{
    public ListaVaziaException (String tipo, String tipoPlural){
        super(String.format("Nenhum %s cadastrado, favor cadastrar %s.", tipo, tipoPlural));
    }
}
