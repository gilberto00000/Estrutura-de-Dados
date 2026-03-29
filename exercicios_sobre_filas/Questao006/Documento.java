package Questao006;
class Documento {
    private String nome;
    private int paginas;
    private int prioridade;

    public Documento(String nome, int paginas, int prioridade) {
        this.nome = nome;
        this.paginas = paginas;
        this.prioridade = prioridade;
    }

    public int getPrioridade() {
        return prioridade;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                ", prioridade=" + prioridade +
                '}';
    }
}