package exercicio004;

public class Teste {
    void main(){
        ListaEncadeada<Livro> catalogo = new ListaEncadeada<>();

        catalogo.adicionar(new Livro("Dom Casmurro", "Machado de Assis", 1899));
        catalogo.adicionar(new Livro("1984", "George Orwell", 1949));
        catalogo.adicionar(new Livro("O Hobbit", "J.R.R. Tolkien", 1937));
        catalogo.adicionar(new Livro("A Revolução dos Bichos", "George Orwell", 1945));
        catalogo.adicionar(new Livro("Capitães da Areia", "Jorge Amado", 1937));

        System.out.println("=== Catálogo de Livros ===");
        catalogo.mostrar();

        System.out.println("\nPrimeiro livro:");
        System.out.println(catalogo.pegaPrimeiro());

        System.out.println("\nÚltimo livro:");
        System.out.println(catalogo.pegaUltimo());
    }
}
