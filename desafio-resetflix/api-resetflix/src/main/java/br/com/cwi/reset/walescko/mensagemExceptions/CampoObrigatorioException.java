package br.com.cwi.reset.walescko.mensagemExceptions;

public class CampoObrigatorioException extends Exception {

    public CampoObrigatorioException() {
        System.out.println("Campo obriatório não informado. Favor informar o campo {campo}");
    }
}
