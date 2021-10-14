package br.com.cwi.reset.walescko.mensagenserro;

public class AtorExistente extends Exception {

    public AtorExistente() {
        System.out.println("Já existe um ator cadastrado para o nome {nome}");
    }
}
