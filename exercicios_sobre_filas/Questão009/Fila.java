package Questao009;

class Fila {
    Tarefa[] fila;
    int tamanho;

    public Fila(int capacidade) {
        fila = new Tarefa[capacidade];
        tamanho = 0;
    }

    public void enfileirar(Tarefa t) {
        int i = tamanho - 1;

        while (i >= 0 && fila[i].getPrioridade() > t.getPrioridade()) {
            fila[i + 1] = fila[i];
            i--;
        }

        fila[i + 1] = t;
        tamanho++;
    }

    public Tarefa executar() {
        if (tamanho == 0) return null;

        Tarefa t = fila[0];

        for (int i = 0; i < tamanho - 1; i++) {
            fila[i] = fila[i + 1];
        }

        tamanho--;

        return t;
    }

    public void mostrar() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(fila[i]);
        }
    }
}