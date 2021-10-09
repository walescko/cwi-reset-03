public class Aplicacao {

    public static void main(String[] args){

        DiretorFilme diretor01 = new DiretorFilme("Gaspar Lucas Spilberg", 45, Genero.MASCULINO, 15);

        Ator ator01 = new Ator("Pierce Browson", 65, Genero.MASCULINO, 13);

        Filme filme01 = new Filme("A volta dos que nao foram", "Aventura", 144,
                1985, 7, diretor01);
//
//        Filme filme02 = new Filme("Poeira em alto mar", "Comédia", 122,
//                1990, 4, diretor01);

//        filme01.apresentarFilme();
//        filme02.apresentarFilme();

        try {
            filme01.AvaliacaoFilme();
        } catch (AvaliacaoForaDoPadraoException e){
            System.out.println(e.getMessage());
        }

//        diretor01.Apresentacao();
//        ator01.Apresentacao();




    }
}
