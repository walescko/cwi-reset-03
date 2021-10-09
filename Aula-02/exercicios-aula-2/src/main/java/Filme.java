public class Filme {

    private String tituloFilme;
    private String descricaoFilme;
    private String anoLancamento;
    private int avaliacaoFilme; //nota numerica
    private DiretorFilme diretor;

    //Contructor com passagem de parametro
    public Filme(String tituloFilme, String descricaoFilme, String anoLancamento, int avaliacaoFilme, DiretorFilme diretor) {
        this.tituloFilme = tituloFilme;
        this.descricaoFilme = descricaoFilme;
        this.anoLancamento = anoLancamento;
        this.avaliacaoFilme = avaliacaoFilme;
        this.diretor = diretor;
    }
}
