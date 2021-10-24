package br.com.cwi.reset.projeto1.controller;

import br.com.cwi.reset.projeto1.domain.Ator;
import br.com.cwi.reset.projeto1.exception.AtorJaExistenteException;
import br.com.cwi.reset.projeto1.exception.AtorNaoExistenteException;
import br.com.cwi.reset.projeto1.service.AtorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/ator")
public class AtorController {

        @Autowired
        private AtorService service;

        @GetMapping
        public List<Ator> getAtor() {
            return service.listarAtor();
        }

        @GetMapping("/{nome}")
        public Ator getByNome(@PathVariable String nome) throws AtorNaoExistenteException {
            return service.findByName(nome);
        }
        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        public Ator cadastrarAtor(@RequestBody Ator ator) throws AtorJaExistenteException {
            return service.salvar(ator);
        }

        @PutMapping
        public Ator atualizarAtor(@RequestBody Ator ator) throws AtorNaoExistenteException {
            return service.atualizar(ator);
        }

        @DeleteMapping("/{nome}")
        public void deletarAtor(@PathVariable String nome) throws AtorNaoExistenteException {
            service.deletarAtor(nome);
        }
    }

}
