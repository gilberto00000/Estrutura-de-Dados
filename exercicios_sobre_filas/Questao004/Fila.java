package Questao004;
public class Fila {
    private Pessoa[] elementos;
    private int inicio;
    private int fim;

    public Fila(int tamanho) {
        elementos = new Pessoa[tamanho];
        inicio = 0;
        fim = 0;
    }

    public boolean estaVazia() {
        return inicio == fim;
    }

    public void enfileirar(Pessoa p) {
        if(fim< elementos.length) {
            elementos[fim] = p;
            fim++;
        }
    }

    public Pessoa desenfileirar() {
        if(!estaVazia()) {
            Pessoa p = elementos[inicio];
            inicio++;
            return p;
        }
        return null;
    }
}