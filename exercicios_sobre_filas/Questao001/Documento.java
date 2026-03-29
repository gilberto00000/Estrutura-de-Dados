package Questao001;

public class Documento {
    private String nome;
    private int paginas;

    public Documento(String nome, int paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Documento");
        sb.append(" nome = ").append(nome);
        sb.append(", paginas = ").append(paginas);
        return sb.toString();
    }
}
