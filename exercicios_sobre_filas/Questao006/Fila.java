package Questao006;
class Fila {
    private Documento[] fila;
    private int tamanho;

    public Fila(int capacidade) {
        fila = new Documento[capacidade];
        tamanho = 0;
    }

    public void enfileirar(Documento doc) {
        int i = tamanho - 1;
        while (i >= 0 && fila[i].getPrioridade() > doc.getPrioridade()) {
            fila[i + 1] = fila[i];
            i--;
        }

        fila[i + 1] = doc;
        tamanho++;
    }

    public Documento imprimir() {
        if (tamanho == 0) return null;

        Documento doc = fila[0];

        for (int i = 0; i < tamanho - 1; i++) {
            fila[i] = fila[i + 1];
        }

        tamanho--;
        return doc;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public void mostrarFila() {
        System.out.println("Fila de impressão:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(fila[i]);
        }
    }
}