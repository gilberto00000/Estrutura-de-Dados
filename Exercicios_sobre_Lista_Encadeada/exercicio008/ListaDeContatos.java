package exercicio008;

package exercicio001;

public class ListaDeContatos {
    private No<Contato> inicio;
    private int tamanho;

    public void adiciona(Contato c) {
        No<Contato> novo = new No<>(c);

        if (inicio == null) {
            inicio = novo;
        } else {
            No<Contato> atual = inicio;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novo);
        }
        tamanho++;
    }

    public boolean contem(String nome) {
        No<Contato> atual = inicio;

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
        No<Contato> atual = inicio;

        while (atual != null) {
            System.out.println(atual.getItem());
            atual = atual.getProximo();
        }
    }
}