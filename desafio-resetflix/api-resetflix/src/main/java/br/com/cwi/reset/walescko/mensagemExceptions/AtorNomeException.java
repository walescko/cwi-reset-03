package br.com.cwi.reset.walescko.mensagemExceptions;

public class AtorNomeException extends Exception {

    public AtorNomeException() {
        System.out.println("Deve ser informado no mínimo nome e sobrenome para o ator");
    }
}
