package br.com.cwi.reset.walescko.mensagenserro;

public class AtorDataNascimento extends Exception {

    public AtorDataNascimento() {
        System.out.println("Não é possível cadastrar atores não nascidos.");
    }
}
