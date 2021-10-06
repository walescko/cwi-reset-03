public class ItensPorQuantidade {

    static int pao = 3600; //peso
    static int torta = 4; //unidade de torta, cliente pede por fatia, então temos aqui 4 tortas totalizando 64 fatias
    static int sanduiche = 20; //unidade
    static int leite = 20; //unidade
    static int cafe = 20; //unidade

    //Estoque de Sanduiche
    static void Estoque() {
        System.out.println("Sanduiches: " + sanduiche);
    }

    static void baixaEstoque(String item, int qtd) {
       if ("sanduiche".equals(item)){
           if (sanduiche >= qtd){
           sanduiche -= qtd;
            } else {
               System.out.println("Sem Estoque para realizar o pedido!");
           }
       }
    }
}