package br.com.cwi.reset.walescko.mensagemExceptions;

public class AtorExistenteException extends Exception {

    public AtorExistenteException() {
        System.out.println("Já existe um ator cadastrado para o nome {nome}");
    }
}
