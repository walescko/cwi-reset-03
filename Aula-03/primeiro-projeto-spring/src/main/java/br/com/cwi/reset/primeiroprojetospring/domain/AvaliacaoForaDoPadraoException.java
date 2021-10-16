package br.com.cwi.reset.primeiroprojetospring.domain;

public class AvaliacaoForaDoPadraoException extends Exception {
    public AvaliacaoForaDoPadraoException(){
        System.out.print("Não é nota de avaliação - valor menor que  0.");
    }

}
