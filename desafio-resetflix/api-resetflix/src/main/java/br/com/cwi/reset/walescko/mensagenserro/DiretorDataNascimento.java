package br.com.cwi.reset.walescko.mensagenserro;

public class DiretorDataNascimento extends Exception {

    public DiretorDataNascimento() {
        System.out.println("Não é possível cadastrar diretores não Nascidos");
    }
}
