public class MainP {
    public static void main(String[] args) {

        Lista estoque = new Lista();

        estoque.adicionar(new Produto("Arroz", 5.4, 3));
        estoque.adicionar(new Produto("Feijão", 4.0, 2));
        estoque.adicionar(new Produto("Macarrão", 2.5, 5));
        estoque.adicionar(new Produto("Leite", 5.7, 4));
        estoque.adicionar(new Produto("Café", 20.5, 1));

        System.out.println("Estoque:");
        estoque.exibir();

        System.out.println("Produto na posição 2:");
        System.out.println(estoque.pega(2));

        System.out.println("Existe 'Café'?");
        System.out.println(estoque.contem("Café"));

        System.out.println("Primeiro produto:");
        System.out.println(estoque.pegaPrimeiro());

        System.out.println("Último produto:");
        System.out.println(estoque.pegaUltimo());
    }
}