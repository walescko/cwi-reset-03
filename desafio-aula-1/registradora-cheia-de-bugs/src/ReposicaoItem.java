public class ReposicaoItem {

    static void ReposicaoItem(String item, int quantidade) {
        if (QuantidadeMinimaItem.precisaReposicao(item)) {

            if ("pao".equals(item) || "sanduiche".equals(item) || "torta".equals(item)) {
                if (DataProjeto.cozinhaEmFuncionamento()) {

                    do {
                        ReposicaoCozinha.reporItem(item);
                    } while ((Estoque.getPao() <= quantidade) || (Estoque.getSanduiche() <= quantidade) || (Estoque.getTorta() <= quantidade));

                } else if (!DataProjeto.cozinhaEmFuncionamento()) {
                    if (Estoque.getPao() < quantidade || Estoque.getSanduiche() < quantidade || Estoque.getFatia() < quantidade) {
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


    }
}
