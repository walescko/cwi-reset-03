package br.com.cwi.reset.walescko.mensagemExceptions;

public class ConsultaIdInvalidoException extends Exception {

    public ConsultaIdInvalidoException(String tipo, Integer id) {
        super(String.format("Nenhum %s encontrado com o parâmetro id = %d, favor verificar os parâmetros informados.", tipo, id));
    }
}
