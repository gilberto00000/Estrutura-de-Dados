package exercicio003;

public class teste {
    void main(){
        ListaEncadeada<Item> lista = new ListaEncadeada<>();

        lista.adicionar(new Item("Arroz", 2));
        lista.adicionar(new Item("Feijão", 1));
        lista.adicionar(new Item("Macarrão", 3));
        lista.adicionar(new Item("Leite", 5));
        lista.adicionar(new Item("Café", 1));
        lista.adicionar(new Item("Açúcar", 2));
        lista.adicionar(new Item("Óleo", 1));

        System.out.println("=== Lista de Compras ===");
        lista.mostrar();

        System.out.println("\nItem na posição:");
        System.out.println(lista.pega(3));

        System.out.println("\nVerificando produto...");
        Item busca = new Item("Leite", 0);

        if (lista.contem(busca)) {
            System.out.println("Produto encontrado!\n" + busca);
        } else {
            System.out.println("Produto NÃO encontrado.");
        }

        System.out.println("\nTotal de itens:");
        System.out.println(lista.getTamanho());
    }
}
