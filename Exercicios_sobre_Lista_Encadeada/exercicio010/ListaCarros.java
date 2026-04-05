package exercicio010;

public class ListaCarros {
    private No<Carro> inicio;
    private No<Carro> ultimo;
    private int tamanho;

    public void adiciona(Carro c) {
        No<Carro> novo = new No<>(c);

        if (inicio == null) {
            inicio = novo;
            ultimo = novo;
        } else {
            ultimo.setProximo(novo);
            ultimo = novo;
        }
        tamanho++;
    }

    public boolean contem(String placa) {
        No<Carro> atual = inicio;

        while (atual != null) {
            if (atual.getItem().placa.equals(placa)) {
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }

    public Carro pegaPrimeiro() {
        return inicio.getItem();
    }

    public Carro pegaUltimo() {
        return ultimo.getItem();
    }

    public void exibir() {
        No<Carro> atual = inicio;

        while (atual != null) {
            System.out.println(atual.getItem());
            atual = atual.getProximo();
        }
    }
}