package br.com.cwi.reset.walescko;

public class RegrasExceptionAtor extends Exception{

    public FaltaCampo(){
        System.out.println("Campo obrigatório não informado. Favor informar o campo {falta dizer o campo não informado aqui}" );

    }

    public idNumerico (){
        System.out.println("O id do ator deve ser gerado automáticamente.");

    }

    public InformarNomeSobrenome() {
        System.out.println("Deve ser informado o nome e sobrenome para o ator");
    }

    public DataNascimento(){
        System.out.println("Não é possível cadastrar atores não nascidos");
    }

    public InicioAtividade(){
        System.out.println("Ano de início inválido para o ator cadastado.");
    }

    public AtorExistente(){
        System.out.prinln("Já existe um ator cadastrado para o nome" + nome);
    }


}
