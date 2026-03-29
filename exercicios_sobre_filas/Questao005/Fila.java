package Questao005;
class Fila {
    private Paciente[] fila;
    private int tamanho;

    public Fila(int capacidade) {
        fila = new Paciente[capacidade];
        tamanho = 0;
    }

    public void enfileirar(Paciente p) {
        int i = tamanho - 1;

        while (i >= 0 && fila[i].getPrioridade() > p.getPrioridade()) {
            fila[i + 1] = fila[i];
            i--;
        }

        fila[i + 1] = p;
        tamanho++;
    }

    public Paciente atender() {
        if (tamanho == 0) {
            return null;
        }

        Paciente atendido = fila[0];

        for (int i = 0; i < tamanho - 1; i++) {
            fila[i] = fila[i + 1];
        }

        tamanho--;
        return atendido;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }
}