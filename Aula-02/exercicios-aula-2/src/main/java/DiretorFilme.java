public class DiretorFilme {

    private String nomeDiretor;
    private int idadeDiretor;
    private int filmesDirigidos;

    public DiretorFilme(String nomeDiretor, int idadeDiretor, int filmesDirigidos) {
        this.nomeDiretor = nomeDiretor;
        this.idadeDiretor = idadeDiretor;
        this.filmesDirigidos = filmesDirigidos;
    }


    public static void diretorEstatistica() {
        System.out.println("Nome: " + nomeDiretor);
        System.out.println("Idade: " + idadeDiretor);
        System.out.println("Filmes dirigidos:" + filmesDirigidos);
    }
}
