class Lista {
    private No inicio;
    private int tamanho;

    public Lista() {
        inicio = null;
        tamanho = 0;
    }

    public void adicionar(Produto produto) {
        No novo = new No(produto);

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
            System.out.println(atual.produto);
            atual = atual.proximo;
        }
    }

    public Produto pega(int indice) {
        if (indice < 0 || indice >= tamanho) {
            return null;
        }

        No atual = inicio;
        int contador = 0;

        while (contador < indice) {
            atual = atual.proximo;
            contador++;
        }

        return atual.produto;
    }

    public boolean contem(String nome) {
        No atual = inicio;

        while (atual != null) {
            if (atual.produto.nome.equalsIgnoreCase(nome)) {
                return true;
            }
            atual = atual.proximo;
        }

        return false;
    }

    public Produto pegaPrimeiro() {
        if (inicio == null) return null;
        return inicio.produto;
    }

    public Produto pegaUltimo() {
        if (inicio == null) return null;

        No atual = inicio;
        while (atual.proximo != null) {
            atual = atual.proximo;
        }

        return atual.produto;
    }
}