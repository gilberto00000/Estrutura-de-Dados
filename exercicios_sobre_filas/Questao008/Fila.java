package Questao008;

class Fila {
    Processo[] fila;
    int tamanho;

    public Fila(int capacidade) {
        fila = new Processo[capacidade];
        tamanho = 0;
    }

    public void adicionar(Processo p) {
        fila[tamanho] = p;
        tamanho++;
    }

    public Processo executar() {
        if (tamanho == 0) return null;

        Processo p = fila[0];

        for (int i = 0; i < tamanho - 1; i++) {
            fila[i] = fila[i + 1];
        }

        tamanho--;

        return p;
    }

    public Processo atual() {
        if (tamanho == 0) return null;
        return fila[0];
    }
}