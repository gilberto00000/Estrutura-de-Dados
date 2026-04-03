package exercicio004;

public class ListaEncadeada<T> {
    private No<T> inicio;
    private int tamanho;

    public ListaEncadeada() {
        inicio = null;
    }


    public void adicionar(T valor) {
        No<T> novo = new No<>(valor);

        if (inicio == null) {
            inicio = novo;
        } else {
            No<T> atual = inicio;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novo);
        }
        tamanho++;
    }


    public void mostrar() {
        No<T> atual = inicio;

        while (atual != null) {
            System.out.println(atual.getValor());
            atual = atual.getProximo();
        }
    }


    public T pegaPrimeiro() {
        if (inicio == null) return null;
        return inicio.getValor();
    }


    public T pegaUltimo() {
        if (inicio == null) return null;

        No<T> atual = inicio;
        while (atual.getProximo() != null) {
            atual = atual.getProximo();
        }

        return atual.getValor();
    }
}
