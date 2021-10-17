package br.com.cwi.reset.walescko.mensagemExceptions;

public class NascidosNoFuturoException extends Exception {

    public NascidosNoFuturoException(String tipo) {
        super(String.format("Não é possível cadastrar %não nascidos.", tipo));
    }
}
