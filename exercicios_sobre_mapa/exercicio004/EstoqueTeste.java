public class EstoqueTeste {
    void main() {

        Mapa<String, Integer> estoque = new Mapa<>();

        System.out.println("Inserir produtos");
        estoque.inserir("Arroz", 10);
        estoque.inserir("Feijão", 5);
        estoque.inserir("Macarrão", 8);
        estoque.inserir("Óleo", 3);

        System.out.println("Estoque inicial:");
        System.out.println(estoque);

        System.out.println("Simular venda");
        venderProduto(estoque, "Arroz", 3);
        venderProduto(estoque, "Feijão", 10); // teste erro
        venderProduto(estoque, "Café", 2);    // teste erro

        System.out.println("\nEstoque atualizado:");
        System.out.println(estoque);
    }


    public static void venderProduto(Mapa<String, Integer> estoque, String produto, int quantidade) {

        Integer qtdAtual = estoque.buscar(produto);

        if (qtdAtual == null) {
            System.out.println("\nProduto não encontrado: " + produto);
            return;
        }

        if (qtdAtual < quantidade) {
            System.out.println("\nEstoque insuficiente de " + produto +
                    " (Disponível: " + qtdAtual + ")");
            return;
        }

        int novaQtd = qtdAtual - quantidade;
        estoque.inserir(produto, novaQtd);

        System.out.println("\nVenda realizada: " + produto +
                " (-" + quantidade + ")");
    }
}