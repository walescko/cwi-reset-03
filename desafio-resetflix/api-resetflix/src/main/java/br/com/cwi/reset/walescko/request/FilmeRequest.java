package br.com.cwi.reset.walescko.request;

import br.com.cwi.reset.walescko.enums.Genero;
import br.com.cwi.reset.walescko.models.Diretor;
import br.com.cwi.reset.walescko.models.Estudio;
import br.com.cwi.reset.walescko.models.PersonagemAtor;

import java.util.List;

public class FilmeRequest {

    private String nome;
    private Integer anoLancamento;
    private String capaFilme;
    private List<Genero> generos;
    private Diretor diretor;
    private Estudio estudio;
    private List<PersonagemAtor> personagens;
    private String resumo;

    public FilmeRequest(String nome, Integer anoLancamento, String capaFilme, List<Genero> generos, Diretor diretor,
                        Estudio estudio, List<PersonagemAtor> personagens, String resumo) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.capaFilme = capaFilme;
        this.generos = generos;
        this.diretor = diretor;
        this.estudio = estudio;
        this.personagens = personagens;
        this.resumo = resumo;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public String getCapaFilme() {
        return capaFilme;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public Estudio getEstudio() {
        return estudio;
    }

    public List<PersonagemAtor> getPersonagens() {
        return personagens;
    }

    public String getResumo() {
        return resumo;
    }
}
