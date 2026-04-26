public class Associacao<K, V> {
    private K chave;
    private V value;

    public Associacao(K chave, V value) {
        this.chave = chave;
        this.value = value;
    }

    public K getChave() {
        return chave;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Associacao{");
        sb.append("chave=").append(chave);
        sb.append(", value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}