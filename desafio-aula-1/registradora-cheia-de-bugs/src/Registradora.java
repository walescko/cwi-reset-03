//Próximas etapas
//Criar uma classe/função para controle do estoque e solicitar a reposição.
//Imprimir após cada pedido se é necessário repor o estoque e imprimir a reposição.
public class Registradora {

    public static void main(String[] args) {
        System.out.println("\n--- Bug 1 ---");
        primeiroBug();
        System.out.println("\n--- Bug 2 ---");
        segundoBug();
        System.out.println("\n--- Bug 3 ---");
        terceiroBug();
        System.out.println("\n--- Bug 4 ---");
        quartoBug();
        System.out.println("\n--- Bug 5 ---");
        quintoBug();
        System.out.println("\n--- Bug 6 ---");
        sextoBug();
    }

    private static double registrarItem(String item, int quantidade) {
        double precoItem = RelacaoPesoPreco.retornaPrecoProduto(item, quantidade);

        if (QuantidadeMinimaItem.precisaReposicao(item)) {
            if ("pao".equals(item) || "sanduiche".equals(item) || "torta".equals(item)) {
                if (!DataProjeto.cozinhaEmFuncionamento()) {
                    System.out.println("Cozinha fechada!");
                }
                ReposicaoCozinha.reporItem(item);
            }

            if ("leite".equals(item) || "cafe".equals(item)) {
                ReposicaoFornecedor.reporItem(item);
            }
        }

        return precoItem;
    }

    private static void primeiroBug() {

        DataProjeto.criarDataComCozinhaFuncionando();
        System.out.println("Dia util? " +DataProjeto.getDiaUtil() + ", horário: "+ DataProjeto.getHora()+ ":"+ DataProjeto.getMinuto()); //apresetando data

        String item = "sanduiche";
        int quantidade = 4;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: R$ %.2f", precoTotal));
            }

    private static void segundoBug() {

        DataProjeto.criarDataComCozinhaEncerradaMasComDiaUtil();
        System.out.println("Dia util? " +DataProjeto.getDiaUtil() + ", horário: "+ DataProjeto.getHora()+ ":"+ DataProjeto.getMinuto()); //apresetando data

        String item = "torta";
        int quantidade = 10;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: R$ %.2f", precoTotal));
    }

    private static void terceiroBug() {
        DataProjeto.criarDataComCozinhaFuncionando();
        System.out.println("Dia util? " +DataProjeto.getDiaUtil() + ", horário: "+ DataProjeto.getHora()+ ":"+ DataProjeto.getMinuto()); //apresetando data

        String item = "cafe";
        int quantidade = 40;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: R$ %.2f", precoTotal));
    }

    private static void quartoBug() {
        DataProjeto.criarDataComCozinhaFuncionando();
        System.out.println("Dia util? " +DataProjeto.getDiaUtil() + ", horário: "+ DataProjeto.getHora()+ ":"+ DataProjeto.getMinuto()); //apresetando data

        // Cliente 1
        String item = "sanduiche";
        int quantidade = 20;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: R$ %.2f", precoTotal));

        // Cliente 2
        String item2 = "sanduiche";
        int quantidade2 = 5;

        double precoTotal2 = registrarItem(item2, quantidade2);

        System.out.println(String.format("Valor total: R$ %.2f", precoTotal2));
    }

    private static void quintoBug() {
        DataProjeto.criarDataComCozinhaFuncionando();
        System.out.println("Dia util? " +DataProjeto.getDiaUtil() + ", horário: "+ DataProjeto.getHora()+ ":"+ DataProjeto.getMinuto()); //apresetando data

        String item = "pao";
        int quantidade = 10;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: R$ %.2f", precoTotal));
    }

    private static void sextoBug() {
        DataProjeto.criarDataComCozinhaEncerradaSemDiaUtil();
        System.out.println("Dia util? " +DataProjeto.getDiaUtil() + ", horário: "+ DataProjeto.getHora()+ ":"+ DataProjeto.getMinuto()); //apresetando data

        // Cliente 1
        String item = "sanduiche";
        int quantidade = 20;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: R$ %.2f", precoTotal));

        // Cliente 2
        String item2 = "sanduiche";
        int quantidade2 = 5;

        double precoTotal2 = registrarItem(item2, quantidade2);

        System.out.println(String.format("Valor total: R$ %.2f", precoTotal2));
    }

}
