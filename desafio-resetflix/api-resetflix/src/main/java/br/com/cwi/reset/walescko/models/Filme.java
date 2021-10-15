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


}
