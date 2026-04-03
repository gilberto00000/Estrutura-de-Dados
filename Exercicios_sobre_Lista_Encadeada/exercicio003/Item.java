package exercicio003;

public class Item {
    String nome;
    int quantidade;

    public Item(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " | Quantidade: " + quantidade;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Item)) return false;

        Item outro = (Item) obj;
        return this.nome.equals(outro.nome);
    }
}
