public class Main {

    public static void main(String[] args){

        DiretorFilme diretor01 = new DiretorFilme("Gaspat Spilber", 44, 5);
        DiretorFilme diretor02 = new DiretorFilme("Japir Adao Spilper", 35, 8);

        Filme filme01 = new Filme("A volta dos que nao foram", "Aventura",
                "1985", 5, diretor01);

        Filme filme02 = new Filme("Poeira em alto mar", "Comédia",
                "1990", 4, diretor02);

        filme01.apresentarFilme();




    }
}
