package br.com.cwi.reset.walescko.models;

import br.com.cwi.reset.walescko.enums.Genero;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private LocalDate anoLancamento;
    private String capaFilme;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Genero[]> generos; //listagem:Genero generos
    @ManyToOne
    @JoinColumn(name = "id_estudio")
    private Estudio estudio;
    @ManyToMany
    @JoinColumn(name = "id_diretor")
    private Diretor diretor;
    @OneToMany
    @JoinColumn(name = "id_personagem_ator")
    private List<PersonagemAtor[]> personagens;  //listagem de PersonagemAtor
    private String resumo;

    public Filme(){

    }

    public Filme(Integer id, String nome, LocalDate anoLancamento, String capaFilme, List<Genero[]> generos,
                 Estudio estudio, Diretor diretor, List<PersonagemAtor[]> personagens, String resumo) {
        this.id = id;
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.capaFilme = capaFilme;
        this.generos = generos;
        this.estudio = estudio;
        this.diretor = diretor;
        this.personagens = personagens;
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

    public List<Genero[]> getGeneros() {
        return generos;
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

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(LocalDate anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setCapaFilme(String capaFilme) {
        this.capaFilme = capaFilme;
    }

    public void setGeneros(List<Genero[]> generos) {
        this.generos = generos;
    }

    public void setEstudio(Estudio estudio) {
        this.estudio = estudio;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public void setPersonagens(List<PersonagemAtor[]> personagens) {
        this.personagens = personagens;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filme filme = (Filme) o;
        return Objects.equals(id, filme.id) && Objects.equals(nome, filme.nome) && Objects.equals(anoLancamento, filme.anoLancamento) && Objects.equals(capaFilme, filme.capaFilme) && Objects.equals(generos, filme.generos) && Objects.equals(estudio, filme.estudio) && Objects.equals(diretor, filme.diretor) && Objects.equals(personagens, filme.personagens) && Objects.equals(resumo, filme.resumo);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, nome, anoLancamento, capaFilme, generos, estudio, diretor, personagens, resumo);
    }


}
