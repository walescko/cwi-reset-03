package br.com.cwi.reset.walescko;

import br.com.cwi.reset.walescko.mensagemExceptions.NomeNaoInformadoException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @GetMapping
    public String helloworld() throws Exception {
        throw new NomeNaoInformadoException();
//        return "Hello World - my API resetflix is UP!";
        }
    }
