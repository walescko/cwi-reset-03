package br.com.cwi.reset.walescko.mensagemExceptions;

public class DiretorExistenteException extends Exception {

    public DiretorExistenteException() {
        System.out.println("Já existe um diretor cadastrado para o nome {nome}");
    }
}
