class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                ", Preço: R$" + preco +
                ", Quantidade: " + quantidade;
    }
}