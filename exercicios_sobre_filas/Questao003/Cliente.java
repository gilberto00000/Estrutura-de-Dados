package Questao003;

public class Cliente {
    private String nome;
    private int produtos;

    public Cliente(String nome, int produtos) {
        this.nome = nome;
        this.produtos = produtos;
    }

    public String getNome() {
        return nome;
    }

    public int getProdutos() {
        return produtos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", produtos=").append(produtos);
        sb.append('}');
        return sb.toString();
    }
}
