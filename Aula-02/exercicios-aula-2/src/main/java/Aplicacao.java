public class Aplicacao {

    public static void main(String[] args){

        Pessoa diretor01 = new DiretorFilme("Gaspar Lucas Spilberg", 44, Genero.FEMININO, 5);

        Pessoa ator01 = new Ator("Pierce Browson", 55, Genero.MASCULINO, 3);

//        Filme filme01 = new Filme("A volta dos que nao foram", "Aventura", 144,
//                1985, 5, diretor01);
//
//        Filme filme02 = new Filme("Poeira em alto mar", "Comédia", 122,
//                1990, 4, diretor01);

//        filme01.apresentarFilme();
//        filme02.apresentarFilme();
        diretor01.Apresentacao();
        ator01.Apresentacao();




    }
}
