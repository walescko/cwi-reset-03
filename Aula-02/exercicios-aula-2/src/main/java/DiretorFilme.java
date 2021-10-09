public class DiretorFilme {

    private static String nomeDiretor;
    private static int idadeDiretor;
    private static int filmesDirigidos;

    public DiretorFilme(String nomeDiretor, int idadeDiretor, int filmesDirigidos) {
        this.nomeDiretor = nomeDiretor;
        this.idadeDiretor = idadeDiretor;
        this.filmesDirigidos = filmesDirigidos;
    }

    public static void diretorEstatistica() {
        System.out.println(" ---- Diretor ---- ");
        System.out.println("Nome: " + getNomeDiretor());
        System.out.println("Idade: " + getIdadeDiretor());
        System.out.println("Filmes dirigidos: " + getFilmesDirigidos());
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
}
