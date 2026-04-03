package exercicio003;

public class ListaEncadeada<T> {
    private No<T> inicio;
    private int tamanho;

    public ListaEncadeada() {
        inicio = null;
        tamanho = 0;
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


    public T pega(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        No<T> atual = inicio;
        int i = 0;

        while (i < indice) {
            atual = atual.getProximo();
            i++;
        }

        return atual.getValor();
    }


    public boolean contem(T valor) {
        No<T> atual = inicio;

        while (atual != null) {
            if (atual.getValor().equals(valor)) {
                return true;
            }
            atual = atual.getProximo();
        }

        return false;
    }


    public int getTamanho() {
        return tamanho;
    }
}
