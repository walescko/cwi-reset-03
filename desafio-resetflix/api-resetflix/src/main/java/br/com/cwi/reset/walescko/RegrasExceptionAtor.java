package br.com.cwi.reset.walescko;

public class RegrasExceptionAtor extends Exception{

//    public String FaltaCampo(){
//        return "Campo obrigatório não informado. Favor informar o campo {falta dizer o campo não informado aqui}";
//    }
//
//    public String idNumerico (){
//        return "O id do ator deve ser gerado automaticamente.";
//    }

    public RegrasExpetionAtor() {
        System.out.println("Deve ser informado o nome e sobrenome para o ator");
    }

    public String DataNascimento(){
        return "Não é possível cadastrar atores não nascidos";
    }

    public String InicioAtividade(){
        return "Ano de início inválido para o ator cadastado.";
    }

    public String AtorExistente(){
        return "Já existe um ator cadastrado para o nome";
    }


}
