package br.com.cwi.reset.walescko.mensagemExceptions;

public class DiretorDataNascimentoException extends Exception {

    public DiretorDataNascimentoException() {
        System.out.println("Não é possível cadastrar diretores não Nascidos");
    }
}
