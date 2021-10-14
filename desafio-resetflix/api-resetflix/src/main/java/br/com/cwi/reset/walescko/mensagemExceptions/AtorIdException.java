package br.com.cwi.reset.walescko.mensagemExceptions;

public class AtorIdException extends Exception{

    public AtorIdException() {
        System.out.println("O id do ator deve ser gerado automaticamente de forma sequencial");
    }
}
