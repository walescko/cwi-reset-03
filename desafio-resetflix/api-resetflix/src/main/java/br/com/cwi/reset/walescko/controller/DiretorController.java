package br.com.cwi.reset.walescko.controller;

import br.com.cwi.reset.walescko.FakeDatabase;
import br.com.cwi.reset.walescko.models.Diretor;
import br.com.cwi.reset.walescko.request.DiretorRequest;
import br.com.cwi.reset.walescko.service.DiretorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/diretores")
public class DiretorController {

    private DiretorService diretorService;

    public DiretorController() {
        this.diretorService = new DiretorService(FakeDatabase.getInstance());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarDiretor(@RequestBody @Valid DiretorRequest diretorRequest) throws Exception {
        this.diretorService.cadastrarDiretor(diretorRequest);
    }

    @GetMapping
    public List<Diretor> listarDiretores(String filtroNome) throws Exception{
        return this.diretorService.listarDiretores(filtroNome);
    }

    @GetMapping(path = "{id}")
    public Diretor consultarDiretor(@PathVariable Integer id) throws Exception{
        return this.diretorService.consultarDiretor(id);
    }
}
