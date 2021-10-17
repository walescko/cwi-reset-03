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

    @GetMapping
    public List<Filme> getFilme(){
        return filmes;
    }

    @GetMapping("/{nome}")
    public ResponseEntity<Filme> getById(@PathVariable String nome){
        Filme filme = buscarFilmePeloNome(nome);
        if (filme == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(filme);
    }

    private Filme buscarFilmePeloNome(String nome){
        for (Filme filme : filmes){
            if (filme.getTituloFilme().equals(nome)){
                return filme;
            }
        }
        return null;
    }

    @PostMapping
    public Filme cadastrarFilme(@RequestBody Filme filme) {
        filmes.add(filme);
        return filme;
    }

    @PutMapping("/filme/{nome}")
    public void atualizarFilme(@RequestBody Filme filme){
        Filme filmeCadastro = buscarFilmePeloNome(filme.getTituloFilme());
        if (filmeCadastro != null){
            filmes.remove(filmeCadastro);
            filmes.add(filme);
        }
    }

    @DeleteMapping
    public void deletarFilme(@PathVariable String nome){
        Filme filme = buscarFilmePeloNome(nome);
        if (filme != null){
            filmes.remove(filme);
        }
    }



//    Filme filme = new Filme("Poeira em Alto Mar", "Filme de Aventura", 144,
//            1980, 5, new Diretor("Gaspar Joaquim", LocalDate.of(1977, 12, 20),Genero.MASCULINO, 5));
}




