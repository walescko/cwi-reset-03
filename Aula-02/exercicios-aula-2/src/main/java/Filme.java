public class Filme {

    private String tituloFilme;
    private String descricaoFilme;
    private Integer duracao;
    private Integer anoLancamento;
    private int avaliacaoFilme; //nota numerica
    private DiretorFilme diretor;

    //Contructor com passagem de parametro
    public Filme(String tituloFilme, String descricaoFilme, Integer duracao, Integer anoLancamento, int avaliacaoFilme, DiretorFilme diretor) {
        this.tituloFilme = tituloFilme;
        this.descricaoFilme = descricaoFilme;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        this.avaliacaoFilme = avaliacaoFilme;
        this.diretor = diretor;
    }

    public void apresentarFilme(){
        System.out.println("Título: " + this.tituloFilme);
        System.out.println("Descrição Filme: " + this.descricaoFilme);
        System.out.println("Lançamento: " + this.anoLancamento);
        System.out.println("Avaliação: " + this.avaliacaoFilme);
        //Pessoa.Apresentacao();
    }

    public void AvaliacaoFilme() throws AvaliacaoForaDoPadraoException{
        if (avaliacaoFilme < 0 || avaliacaoFilme > 5){
            throw new AvaliacaoForaDoPadraoException();
        }
    }
}
