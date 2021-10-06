public class ReposicaoCozinha {

    static void reporItem(String item) {
        if ("pao".equals(item)) {
            Estoque.pao = 3600;
            //solicitar repor os pães que são vendidos por unidade, mas o que temos aqui é peso em gramas.
        }
        if ("torta".equals(item)) {
            Estoque.torta = 4;

        }
        if ("sanduiche".equals(item)) {
            Estoque.sanduiche = 20;
        }
    }
}
