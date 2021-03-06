package br.com.cwi.reset.walescko.mensagemExceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ConsultaIdInvalidoException extends Exception {

    public ConsultaIdInvalidoException(String tipo, Integer id) {
        super(String.format("Nenhum %s encontrado com o parâmetro id = %d, favor verificar os parâmetros informados.", tipo, id));
    }
}
