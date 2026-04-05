package exercicio008;

public class MainA {
    public static void main(String[] args) {

        ListaContatos lista = new ListaContatos();

        lista.adiciona(new Contato("Ana", "1111"));
        lista.adiciona(new Contato("Bruno", "2222"));
        lista.adiciona(new Contato("Carlos", "3333"));
        lista.adiciona(new Contato("Davi", "4444"));
        lista.adiciona(new Contato("Eva", "5555"));
        lista.adiciona(new Contato("Felipe", "6666"));

        System.out.println("=== CONTATOS ===");
        lista.exibir();

        System.out.println("\nExiste Ana? " + lista.contem("Ana"));
        System.out.println("Total de contatos: " + lista.getTamanho());
    }
}