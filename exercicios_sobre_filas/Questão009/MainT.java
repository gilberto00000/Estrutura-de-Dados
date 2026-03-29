package Questao009;

public class MainT {
    public static void main(String[] args) {

        FilaPrioridade fila = new FilaPrioridade(10);

        fila.enfileirar(new Tarefa("Atualizar sistema", 3));
        fila.enfileirar(new Tarefa("Verificar erro crítico", 1));
        fila.enfileirar(new Tarefa("Backup", 2));

        System.out.println("Fila antes:");
        fila.mostrar();

        System.out.println("\nExecutando: " + fila.executar());

        System.out.println("\nFila depois:");
        fila.mostrar();
    }
}