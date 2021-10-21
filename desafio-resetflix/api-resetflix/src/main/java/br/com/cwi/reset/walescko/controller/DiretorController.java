package br.com.cwi.reset.walescko.controller;

import br.com.cwi.reset.walescko.FakeDatabase;
import br.com.cwi.reset.walescko.models.Ator;
import br.com.cwi.reset.walescko.models.Diretor;
import br.com.cwi.reset.walescko.request.DiretorRequest;
import br.com.cwi.reset.walescko.service.DiretorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/diretores")
public class DiretorController {

    private DiretorService diretorService;

    private static List<Diretor> diretores = new ArrayList<>();


    public DiretorController() {
        this.diretorService = new DiretorService(FakeDatabase.getInstance());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarDiretor(@RequestBody DiretorRequest diretorRequest) throws Exception {
        this.diretorService.cadastrarDiretor(diretorRequest);
    }

    @GetMapping
    public List<Diretor> listarDiretores(String filtroNome) throws Exception{
        return this.diretorService.listarDiretores(filtroNome);
    }
    
    @GetMapping(path = "{id}")
    public Ator consultarDiretor(@PathVariable Integer id) throws Exception{
        return this.diretorService.consultarDiretor(id);
    }
}
