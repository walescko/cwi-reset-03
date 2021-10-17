package br.com.cwi.reset.primeiroprojetospring.controller;

import br.com.cwi.reset.primeiroprojetospring.domain.Diretor;
import br.com.cwi.reset.primeiroprojetospring.domain.Filme;
import br.com.cwi.reset.primeiroprojetospring.domain.Genero;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/filme")
public class FilmeController {

    private static List<Filme> filmes = new ArrayList<>();

    //public List<Filme> getFilme(){
      //  return filmes;
    //}

    @PostMapping
    public ResponseEntity<Filme> cadastrarFilme(@RequestBody Filme filme){
        Filme filmeExistente = buscarFilme(filme.getTituloFilme());
        if (filmeExistente != null){
            return ResponseEntity.badRequest().build();
        }
        filmes.add(filme);
        return ResponseEntity.ok(filme);
    }

    @GetMapping
    public List<Filme> consultarTodos(){
        return filmes;
    }

    @GetMapping("/{tituloFilme}")
    public Filme buscarFilmePeloNome(@PathVariable String tituloFilme) {
        return buscarFilme(tituloFilme);
    }

    @DeleteMapping("/{tituloFilme}")
    public void deletarFilme(@PathVariable String tituloFilme){
        Filme filme = buscarFilmePeloNome(tituloFilme);
        if (filme != null){
            filmes.remove(filme);
        }
    }

    @PutMapping
    public Filme atualizarFilme(@RequestBody Filme filme){
        Filme filmeExistente = buscarFilmePeloNome(filme.getTituloFilme());
        if (filmeExistente != null){
            filmes.remove(filmeExistente);
            filmes.add(filme);
            return filme;
        }
        return null;
    }

    private Filme buscarFilme(String tituloFilme){
        for (Filme filme : filmes){
            if (filme.getTituloFilme().equals(tituloFilme)){
                return filme;
            }
        }
        return null;
    }


//    Filme filme = new Filme("Poeira em Alto Mar", "Filme de Aventura", 144,
//            1980, 5, new Diretor("Gaspar Joaquim", LocalDate.of(1977, 12, 20),Genero.MASCULINO, 5));
}




