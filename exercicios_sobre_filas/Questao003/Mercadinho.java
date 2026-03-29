package Questao003;

public class Mercadinho {
    void main(){
        Fila<Cliente> fila = new Fila<>(5);

        // Enfileirando 5 clientes
        fila.adiciona(new Cliente("João", 10));
        fila.adiciona(new Cliente("Maria", 5));
        fila.adiciona(new Cliente("Pedro", 8));
        fila.adiciona(new Cliente("Ana", 3));
        fila.adiciona(new Cliente("Lucas", 12));

        System.out.println("Fila inicial:");
        System.out.println(fila);

        System.out.println("\n--- Iniciando atendimento ---\n");

        // Atendimento
        while (fila.getTamanho() > 0) {
            Cliente c = fila.desenfileirar();

            System.out.println("Atendendo cliente: " + c.getNome());
            System.out.println("Produtos: " + c.getProdutos());
            System.out.println("Clientes restantes: " + fila.getTamanho());
            System.out.println("----------------------------");
        }

        System.out.println("\nFila vazia. Caixa encerrado.");
    }
}
