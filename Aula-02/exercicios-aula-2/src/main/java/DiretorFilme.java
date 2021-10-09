public class DiretorFilme {

    private  static String nomeDiretor;
    private static int idadeDiretor;
    private static int filmesDirigidos;
    private static Genero genero;

    public DiretorFilme(String nomeDiretor, int idadeDiretor, int filmesDirigidos, Genero genero) {
        this.nomeDiretor = nomeDiretor;
        this.idadeDiretor = idadeDiretor;
        this.filmesDirigidos = filmesDirigidos;
        this.genero = genero;
    }

    public static void diretorApresentacao() {
        System.out.println(" ---- Diretor ---- ");
        System.out.println("Nome: " + getNomeDiretor());
        System.out.println("Idade: " + getIdadeDiretor());
        System.out.println("Filmes dirigidos: " + getFilmesDirigidos());
        System.out.println("Genero: " + genero.getDescricao());
        System.out.println(" ----------------- ");
        }

    public static String getNomeDiretor() {
        return nomeDiretor;
    }

    public static int getIdadeDiretor() {
        return idadeDiretor;
    }

    public static int getFilmesDirigidos() {
        return filmesDirigidos;
    }
    public static Genero getGenero(){
        return genero;
    };

}
