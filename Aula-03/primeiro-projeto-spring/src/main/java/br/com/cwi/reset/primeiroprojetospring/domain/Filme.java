package br.com.cwi.reset.primeiroprojetospring.domain;

public class Filme {
    private String tituloFilme;
    private String descricaoFilme;
    private Integer duracao;
    private Integer anoLancamento;
    private int avaliacaoFilme; //nota numerica
    private Diretor diretor;

    //Contructor com passagem de parametro
    public Filme(String tituloFilme, String descricaoFilme, Integer duracao, Integer anoLancamento, int avaliacaoFilme, Diretor diretor) {
        this.tituloFilme = tituloFilme;
        this.descricaoFilme = descricaoFilme;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        this.avaliacaoFilme = avaliacaoFilme;
        this.diretor = diretor;
    }

    public void apresentarFilme(){
        System.out.println("Título: " + this.getTituloFilme());
        System.out.println("Descrição Filme: " + this.getDescricaoFilme());
        System.out.println("Lançamento: " + this.getAnoLancamento());
        System.out.println("Avaliação: " + this.getAvaliacaoFilme());
        //Pessoa.Apresentacao();
    }

    public String getTituloFilme() {
        return tituloFilme;
    }

    public void setTituloFilme(String tituloFilme) {
        this.tituloFilme = tituloFilme;
    }

    public String getDescricaoFilme() {
        return descricaoFilme;
    }

    public void setDescricaoFilme(String descricaoFilme) {
        this.descricaoFilme = descricaoFilme;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getAvaliacaoFilme() {
        return avaliacaoFilme;
    }

    public void setAvaliacaoFilme(int avaliacaoFilme) {
        this.avaliacaoFilme = avaliacaoFilme;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }
}
