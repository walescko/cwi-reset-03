public class QuantidadeMinimaItem {

    public static boolean precisaReposicao(String item) {
        if ("pao".equals(item)) {
            return Estoque.pao < 600;
        }

        if ("torta".equals(item)) {
            return Estoque.torta < 10;
        }

        if ("sanduiche".equals(item)) {
            return Estoque.sanduiche <= 1;
        }

        if ("cafe".equals(item)) {
            return Estoque.leite < 12;
        }

        if ("leite".equals(item)) {
            return Estoque.cafe < 12;
        }

        return false;
    }
}
