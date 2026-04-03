class Lista {
    private No inicio;
    private int tamanho;

    public Lista() {
        inicio = null;
        tamanho = 0;
    }

    public void adicionar(Convidado convidado) {
        No novo = new No(convidado);

        if (inicio == null) {
            inicio = novo;
        } else {
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }

        tamanho++;
    }

    public void exibir() {
        No atual = inicio;

        while (atual != null) {
            System.out.println(atual.convidado);
            atual = atual.proximo;
        }
    }
    public boolean contem(String cpf) {
        No atual = inicio;

        while (atual != null) {
            if (atual.convidado.cpf.equals(cpf)) {
                return true;
            }
            atual = atual.proximo;
        }

        return false;
    }

    public int getTamanho() {
        return tamanho;
    }
}