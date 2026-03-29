package Questao002;

public class Atendimento {
    void main(){
        Fila<Cliente> fila = new Fila<>(6);

        // Enfileirando 6 clientes
        fila.adiciona(new Cliente("João", 101));
        fila.adiciona(new Cliente("Maria", 102));
        fila.adiciona(new Cliente("Pedro", 103));
        fila.adiciona(new Cliente("Ana", 104));
        fila.adiciona(new Cliente("Lucas", 105));
        fila.adiciona(new Cliente("Carla", 106));

        System.out.println("Fila inicial:");
        System.out.println(fila);

        System.out.println("\n--- Iniciando atendimento ---\n");

        // Atendimento
        while(fila.getTamanho() > 0) {
            Cliente c = fila.desenfileirar();
            System.out.println("Chamando senha: " + c.getSenha());
        }

        System.out.println("\n--- Fila vazia. Atendimento finalizado. ---\n");




    }
}
