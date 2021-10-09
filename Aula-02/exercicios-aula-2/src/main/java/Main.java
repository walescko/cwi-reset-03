public class Main {

    public static void main(String[] args){

        DiretorFilme diretor01 = new DiretorFilme("Gaspar Lucas", 44, 5,
                Genero.FEMININO);
        Ator ator01 = new Ator("Pierce Browson", 55, 25, Genero.MASCULINO);
        Filme filme01 = new Filme("A volta dos que nao foram", "Aventura", 144,
                1985, 5, diretor01);

        Filme filme02 = new Filme("Poeira em alto mar", "Comédia", 122,
                1990, 4, diretor01);

//        filme01.apresentarFilme();
//        filme02.apresentarFilme();
        diretor01.diretorApresentacao();
        ator01.apresentacaoAtor();




    }
}
