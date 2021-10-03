
public class Registradora {

    public static void main(String[] args) {
        primeiroBug();

        segundoBug();

        terceiroBug();

        quartoBug();

        quintoBug();

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

        String item = "sanduiche"; //na classe RelacaoPesoPreco está "sanduba"
        int quantidade = 4;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: R$ %.2f", precoTotal));
        System.out.println("----");
    }

    private static void segundoBug() {
        DataProjeto.criarDataComCozinhaEncerradaMasComDiaUtil();
        System.out.println("Dia util? " +DataProjeto.getDiaUtil() + ", horário: "+ DataProjeto.getHora()+ ":"+ DataProjeto.getMinuto()); //apresetando data

        String item = "torta";
        int quantidade = 10;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: R$ %.2f", precoTotal));
        System.out.println("----");
    }

    private static void terceiroBug() {
        DataProjeto.criarDataComCozinhaFuncionando();
        System.out.println("Dia util? " +DataProjeto.getDiaUtil() + ", horário: "+ DataProjeto.getHora()+ ":"+ DataProjeto.getMinuto()); //apresetando data

        String item = "cafe";
        int quantidade = 40;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: R$ %.2f", precoTotal));
        System.out.println("----");
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
        System.out.println("----");
    }

    private static void quintoBug() {
        DataProjeto.criarDataComCozinhaFuncionando();
        System.out.println("Dia util? " +DataProjeto.getDiaUtil() + ", horário: "+ DataProjeto.getHora()+ ":"+ DataProjeto.getMinuto()); //apresetando data

        String item = "pao";
        int quantidade = 10;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: R$ %.2f", precoTotal));
        System.out.println("----");
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
        System.out.println("----");
    }

}
