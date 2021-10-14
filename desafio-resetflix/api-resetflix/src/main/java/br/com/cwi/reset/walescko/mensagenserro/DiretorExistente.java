package br.com.cwi.reset.walescko.mensagenserro;

public class DiretorExistente extends Exception {

    public DiretorExistente() {
        System.out.println("Já existe um diretor cadastrado para o nome {nome}");
    }
}
