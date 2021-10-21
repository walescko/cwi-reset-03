package br.com.cwi.reset.walescko.controller;

import br.com.cwi.reset.walescko.FakeDatabase;
import br.com.cwi.reset.walescko.mensagemExceptions.EstudioIdException;
import br.com.cwi.reset.walescko.models.Estudio;
import br.com.cwi.reset.walescko.request.EstudioRequest;
import br.com.cwi.reset.walescko.service.EstudioService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/estudios")
public class EstudioController {
    private EstudioService estudioService;

    private static List<Estudio> estudios = new ArrayList<>();


    public EstudioController() {
        this.estudioService = new EstudioService(FakeDatabase.getInstance());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarEstudio(@RequestBody EstudioRequest estudioRequest) throws Exception {
        this.estudioService.cadastrarEstudio(estudioRequest);
    }

    @GetMapping
    public List<Estudio> consultarEstudios(@RequestParam String filtroNome) throws Exception{
        return this.estudioService.consultarEstudios(filtroNome);
    }

    @GetMapping(path = "{id}")
    public Estudio consultarEstudio(@PathVariable Integer id) throws Exception{
        return this.estudioService.consultarEstudio(id);
    }
}
