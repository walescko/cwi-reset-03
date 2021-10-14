package br.com.cwi.reset.walescko.mensagemExceptions;

public class AtorAnoInicioAtividadeException extends Exception {

    public AtorAnoInicioAtividadeException() {
        System.out.println("Ano de início de atividade inválido para o ator cadastrado.");
    }
}
