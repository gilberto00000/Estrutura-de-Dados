package Questao006;
public class MainD {
    public static void main(String[] args) {

        Fila fila = new Fila(10);

        fila.enfileirar(new Documento("Doc1", 10, 2));
        fila.enfileirar(new Documento("Doc2", 5, 1));
        fila.enfileirar(new Documento("Doc3", 8, 3));
        fila.enfileirar(new Documento("Doc4", 12, 1));
        fila.enfileirar(new Documento("Doc5", 7, 2));

        fila.mostrarFila();

        System.out.println("Impressão:");

        while (!fila.estaVazia()) {
            System.out.println("Imprimindo: " + fila.imprimir());
        }
    }
}