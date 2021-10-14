package br.com.cwi.reset.walescko.mensagenserro;

public class CampoObrigatorio extends Exception {

    public CampoObrigatorio() {
        System.out.println("Campo obriatório não informado. Favor informar o campo {campo}");
    }
}
