package br.com.cwi.reset.walescko.mensagenserro;

public class AtorNome extends Exception {

    public AtorNome() {
        System.out.println("Deve ser informado no mínimo nome e sobrenome para o ator");
    }
}
