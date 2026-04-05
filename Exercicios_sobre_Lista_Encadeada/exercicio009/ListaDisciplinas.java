package exercicio009;

public class ListaDisciplinas {
    private No<Disciplina> inicio;
    private int tamanho;

    public void adiciona(Disciplina d) {
        No<Disciplina> novo = new No<>(d);

        if (inicio == null) {
            inicio = novo;
        } else {
            No<Disciplina> atual = inicio;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novo);
        }
        tamanho++;
    }

    public Disciplina pega(int indice) {
        No<Disciplina> atual = inicio;

        for (int i = 0; i < indice; i++) {
            atual = atual.getProximo();
        }

        return atual.getItem();
    }

    public boolean contem(String nome) {
        No<Disciplina> atual = inicio;

        while (atual != null) {
            if (atual.getItem().nome.equals(nome)) {
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void exibir() {
        No<Disciplina> atual = inicio;

        while (atual != null) {
            System.out.println(atual.getItem());
            atual = atual.getProximo();
        }
    }
}