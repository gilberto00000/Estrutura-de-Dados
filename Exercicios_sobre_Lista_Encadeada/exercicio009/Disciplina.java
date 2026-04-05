package exerciocio009;

public class Disciplina {
    private String nome;
    private double nota;

    public Disciplina(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String toString() {
        return nome + " - Nota: " + nota;
    }
}