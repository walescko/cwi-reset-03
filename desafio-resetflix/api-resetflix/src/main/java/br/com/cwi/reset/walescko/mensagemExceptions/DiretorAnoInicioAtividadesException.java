package br.com.cwi.reset.walescko.mensagemExceptions;

public class DiretorAnoInicioAtividadesException extends Exception {

    public DiretorAnoInicioAtividadesException() {
        System.out.println("Ano de início de atividade inválido para diretor cadastrado.");
    }
}
