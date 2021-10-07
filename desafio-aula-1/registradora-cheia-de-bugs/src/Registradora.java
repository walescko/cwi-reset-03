//Próximas etapas
//Criar uma classe/função para controle do estoque e solicitar a reposição.
//Imprimir após cada pedido se é necessário repor o estoque e imprimir a reposição.
public class Registradora {

    public static void main(String[] args) {
//        System.out.println("\n--- Bug 1 ---");
//        primeiroBug();
//        Estoque.EstoquePadaria();
        System.out.println("\n--- Bug 2 ---");
        segundoBug();
        Estoque.EstoquePadaria();
//        System.out.println("\n--- Bug 3 ---");
//        terceiroBug();
//        Estoque.EstoquePadaria();
//        System.out.println("\n--- Bug 4 ---");
//        quartoBug();
//        Estoque.EstoquePadaria();
//        System.out.println("\n--- Bug 5 ---");
//        quintoBug();
//        Estoque.EstoquePadaria();
        System.out.println("\n--- Bug 6 ---");
        sextoBug();
        Estoque.EstoquePadaria();
   }

    private static double registrarItem(String item, int quantidade) {




                if (QuantidadeMinimaItem.precisaReposicao(item)) {

                        if ("pao".equals(item) || "sanduiche".equals(item) || "torta".equals(item)) {
                            if (DataProjeto.cozinhaEmFuncionamento()) {
                                do {
                                    ReposicaoCozinha.reporItem(item);
                            } while ((Estoque.getPao() <= quantidade) || (Estoque.getSanduiche() <= quantidade) || (Estoque.getTorta() <= quantidade));
                            } else if (!DataProjeto.cozinhaEmFuncionamento()) {
                                if (Estoque.getPao() < quantidade || Estoque.getSanduiche() < quantidade || Estoque.getFatia() < quantidade){
                                    System.out.println("Cozinha Fechada!");
                            }
                            }
                        }


                    do {
                    if ("leite".equals(item) || "cafe".equals(item)) {
                        ReposicaoFornecedor.reporItem(item);
                    }
                    } while ((Estoque.getCafe() <= quantidade) || (Estoque.getLeite() <= quantidade));
                }
            double precoItem = RelacaoPesoPreco.retornaPrecoProduto(item, quantidade);
        //verificação da quantidade no estoque
            Estoque.baixaEstoque(item, quantidade);
            return precoItem;
        }


    private static void primeiroBug() {

        DataProjeto.criarDataComCozinhaFuncionando();

        String item = "sanduiche";
        int quantidade = 4;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: R$ %.2f", precoTotal));
    }

    private static void segundoBug() {

        DataProjeto.criarDataComCozinhaEncerradaMasComDiaUtil();

        String item = "torta";
        int quantidade = 10;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: R$ %.2f", precoTotal));
    }

    private static void terceiroBug() {
        DataProjeto.criarDataComCozinhaFuncionando();

        String item = "cafe";
        int quantidade = 40;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: R$ %.2f", precoTotal));
    }

    private static void quartoBug() {
        DataProjeto.criarDataComCozinhaFuncionando();

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

        String item = "pao";
        int quantidade = 10;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: R$ %.2f", precoTotal));
    }

    private static void sextoBug() {
        DataProjeto.criarDataComCozinhaEncerradaSemDiaUtil();

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
