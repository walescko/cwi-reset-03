public class Ator {

    private String nomeAtor;
    private Integer idadeAtor;
    private Integer oscar;
    private Genero genero;

    public Ator(String nomeAtor, Integer idadeAtor, Integer oscar, Genero genero) {
        this.nomeAtor = nomeAtor;
        this.idadeAtor = idadeAtor;
        this.oscar = oscar;
        this.genero = genero;
    }

    public void apresentacaoAtor(){
        System.out.println(" ---- Ator ---- ");
        System.out.println("Nome: " + getNomeAtor());
        System.out.println("Idade: " + getIdadeAtor());
        System.out.println("Oscar: " + getOscar());
        System.out.println("Genero: " + getGenero() );
        System.out.println(" ----------------- ");
    }

    public String getNomeAtor() {
        return nomeAtor;
    }

    public Integer getIdadeAtor() {
        return idadeAtor;
    }

    public Integer getOscar() {
        return oscar;
    }

    public Genero getGenero() {
        return genero;
    }
}
