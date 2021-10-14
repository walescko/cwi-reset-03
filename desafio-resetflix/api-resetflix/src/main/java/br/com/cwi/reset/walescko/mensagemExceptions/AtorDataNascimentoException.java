package br.com.cwi.reset.walescko.mensagemExceptions;

public class AtorDataNascimentoException extends Exception {

    public AtorDataNascimentoException() {
        System.out.println("Não é possível cadastrar atores não nascidos.");
    }
}
