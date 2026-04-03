package exercicio002;


public class ListaEncadeada<T> {
    private No<T> inicio;
    private int tamanho;

    public ListaEncadeada(){
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
    public void mostrar() {
        No<T> atual = inicio;

        while (atual != null) {
            System.out.println(atual.getItem());
            atual = atual.proximo;
        }
    }


    public boolean contem(T valor) {
        No<T> atual = inicio;

        while (atual != null) {
            if (atual.getItem().equals(valor)) {
                return true;
            }
            atual = atual.proximo;
        }

        return false;
    }

    public int getTamanho() {
        return tamanho;
    }
}
