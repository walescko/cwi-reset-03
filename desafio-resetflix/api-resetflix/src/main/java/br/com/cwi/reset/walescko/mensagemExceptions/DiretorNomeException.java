package br.com.cwi.reset.walescko.mensagemExceptions;

public class DiretorNomeException extends Exception{

    public DiretorNomeException()  {
    System.out.println("Deve ser informado no mínimo nome e sobrenome para o diretor");
    }
}

