package exercicio001;

public class ListaDeChamada<T> {
    private No<T> inicio;
    private int tamanho;

    public ListaDeChamada(){
        inicio = null;
    }

    public void adicionar(T valor) {
        No<T> novo = new No<>(valor);

        if (inicio == null) {
            inicio = novo;
        } else {
            No<T> atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }

        tamanho++;
    }

    public T pegaPrimeiro() {
        if (inicio == null) return null;
        return inicio.getItem();
    }

    public T pegaUltimo() {
        if (inicio == null) return null;

        No<T> atual = inicio;
        while (atual.proximo != null) {
            atual = atual.proximo;
        }

        return atual.getItem();
    }

    public void mostrar() {
        No<T> atual = inicio;

        while (atual != null) {
            System.out.println(atual.getItem());
            atual = atual.proximo;
        }
    }

    public int getTamanho() {
        return tamanho;
    }

}
