public class Lista {
    private No inicio;
    private int tamanho;

    public Lista() {
        inicio = null;
        tamanho = 0;
    }

    public void adicionar(Pagina pagina) {
        No novo = new No(pagina);

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
            System.out.println(atual.pagina);
            atual = atual.proximo;
        }
    }

    public boolean contem(String titulo) {
        No atual = inicio;

        while (atual != null) {
            if (atual.pagina.titulo.equalsIgnoreCase(titulo)) {
                return true;
            }
            atual = atual.proximo;
        }

        return false;
    }

    public Pagina pegaUltimo() {
        if (inicio == null) return null;

        No atual = inicio;
        while (atual.proximo != null) {
            atual = atual.proximo;
        }

        return atual.pagina;
    }

    public int getTamanho() {
        return tamanho;
    }
}