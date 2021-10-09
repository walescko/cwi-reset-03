public class DiretorFilme extends Pessoa {

    private static int filmesDirigidos;

    public DiretorFilme(String nome, int idade, Genero genero, int filmesDirigidos) {
        super(nome, idade, genero);
        this.filmesDirigidos = filmesDirigidos;

    }


}
