package br.com.cwi.reset.walescko.models;

import br.com.cwi.reset.walescko.enums.Genero;

import java.time.LocalDate;
import java.util.List;

public class Filme {

    private Integer id;
    private String nome;
    private LocalDate anoLancamento;
    private String capaFilme;
    private List<Genero[]> genero; //listagem:Genero generos
    private Diretor diretor;
    private List<PersonagemAtor[]> personagens;  //listagem de PersonagemAtor
    private String resumo;
    private Estudio estudio;

    public Filme(Integer id, String nome, LocalDate anoLancamento, String capaFilme, List<Genero[]> genero, Diretor diretor, List<PersonagemAtor[]> personagens, Estudio estudio, String resumo) {
        this.id = id;
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.capaFilme = capaFilme;
        this.genero = genero;
        this.diretor = diretor;
        this.personagens = personagens;
        this.estudio = estudio;
        this.resumo = resumo;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getAnoLancamento() {
        return anoLancamento;
    }

    public String getCapaFilme() {
        return capaFilme;
    }

    public List<Genero[]> getGenero() {
        return genero;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public List<PersonagemAtor[]> getPersonagens() {
        return personagens;
    }

    public Estudio getEstudio() {
        return estudio;
    }

    public String getResumo() {
        return resumo;
    }
}
