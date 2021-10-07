public class Estoque {

    static int pao = 3600; //peso
    static int torta = 4; //unidade de torta, cliente pede por fatia, então temos aqui 4 tortas totalizando 64 fatias
    static int sanduiche = 20; //unidade
    static int leite = 20; //unidade
    static int cafe = 20; //unidade
    static int fatia = torta*16; //variavel auxiliar para o controle das tortas

    //Estoque

    static void EstoquePadaria() {
        System.out.println("\n------- Estoque -------");
        System.out.println("Sanduiches: " + sanduiche);
        System.out.println("Leite: " + leite);
        System.out.println("Cafe: "+ cafe);
        System.out.println("Fatias de Torta: " + fatia);
        System.out.println("Pão (gramas): " + pao);
        System.out.println("------   ------\n");
    }

    static void baixaEstoque(String item, int qtd) {
       if ("pao".equals(item)){
           int peso = qtd*60;
           if (pao >= peso){
           pao -= peso;
            } else {
               ReposicaoCozinha.reporItem(item);
           }
       } else if ("torta".equals(item)){
           if (fatia >= qtd){
               fatia -= qtd;
           } else {
               ReposicaoCozinha.reporItem(item);
           }
       } else if ("sanduiche".equals(item)){
           if (sanduiche >= qtd){
               sanduiche -= qtd;
           } else {
               ReposicaoCozinha.reporItem(item);
           }
       } else if ("leite".equals(item)){
           if (leite >= qtd){
               leite -= qtd;
           } else{
               ReposicaoFornecedor.reporItem(item);
           }
        } else if ("cafe".equals(item)){
           if (cafe >= qtd){
               cafe -= qtd;
           } else {
               ReposicaoFornecedor.reporItem(item);
           }
       }

    }

     public static int getPao() {
        return pao;
    }

    public static void setPao(int pao) {
        Estoque.pao = pao;
    }

    public static int getTorta() {
        return torta;
    }

    public static void setTorta(int torta) {
        Estoque.torta = torta;
    }

    public static int getSanduiche() {
        return sanduiche;
    }

    public static void setSanduiche(int sanduiche) {
        Estoque.sanduiche = sanduiche;
    }

    public static int getLeite() {
        return leite;
    }

    public static void setLeite(int leite) {
        Estoque.leite = leite;
    }

    public static int getCafe() {
        return cafe;
    }

    public static void setCafe(int cafe) {
        Estoque.cafe = cafe;
    }

    public static int getFatia() {
        return fatia;
    }

    public static void setFatia(int fatia) {
        Estoque.fatia = fatia;
    }
}