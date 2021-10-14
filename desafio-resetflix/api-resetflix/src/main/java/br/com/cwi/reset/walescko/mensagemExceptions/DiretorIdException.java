package br.com.cwi.reset.walescko.mensagemExceptions;

public class DiretorIdException extends Exception {

    public DiretorIdException() {
    System.out.println("O id do diretor deve ser gerado automaticamente de forma sequencial");
    }
}
