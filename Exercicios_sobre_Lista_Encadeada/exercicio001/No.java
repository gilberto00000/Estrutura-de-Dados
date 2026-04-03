package exercicio001;

public class No<T>{
    private T item;
    No proximo;


    public No(T elemento){
        item = elemento;
        proximo = null;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("No{");
        sb.append("item=").append(item);
        sb.append(", proximo=").append(proximo);
        sb.append('}');
        return sb.toString();
    }
}
