package Questao009;

class Tarefa {
    String nome;
    int prioridade;

    public Tarefa(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public String toString() {
        return nome + " (Prioridade: " + prioridade + ")";
    }
}