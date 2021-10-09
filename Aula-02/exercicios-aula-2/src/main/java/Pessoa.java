public class Pessoa {

    private String nome;
    private Integer idade;
    private Genero genero;

    public Pessoa(String nome, Integer idade, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public void Apresentacao(){
        System.out.println(" ---- Casting ---- ");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Genero: " + genero.getDescricao());
        System.out.println(" ----------------- ");
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Genero getGenero() {
        return genero;
    }
}
