public class ReposicaoCozinha {

    static void reporItem(String item) {
        if ("pao".equals(item)) {
            Estoque.pao += 3600;
        }
        if ("torta".equals(item)) {

            Estoque.fatia += 4*16;
        }
        if ("sanduiche".equals(item)) {
            Estoque.sanduiche += 20;
        }
    }
}
