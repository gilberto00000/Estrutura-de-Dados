package exercicio010;

public class No<T> {
    private T item;
    private No<T> proximo;

    public No(T elemento) {
        item = elemento;
        proximo = null;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    public T getItem() {
        return item;
    }
}