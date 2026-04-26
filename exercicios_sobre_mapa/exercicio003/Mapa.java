public class Mapa<K, V> {
    private ListaEncadeada<Associacao<K, V>> lista;

    public Mapa() {
        this.lista = new ListaEncadeada<>();
    }

    //INSERIR CHAVE E UM VALOR
    public V inserir(K chave, V valor) {
        for (int i = 0; i < lista.getTamanho(); i++) {
            Associacao<K, V> assoc = lista.buscaPorPosicao(i);

            if (assoc.getChave().equals(chave)) {
                V antigo = assoc.getValue();
                assoc.setValue(valor);
                return antigo;
            }

        }
        lista.adiciona(new Associacao<>(chave, valor));
        return null;
    }

    public V buscar(K chave) {
        for (int i = 0; i < lista.getTamanho(); i++) {
            Associacao<K, V> assoc = lista.buscaPorPosicao(i);

            if (assoc.getChave().equals(chave)) {
                return assoc.getValue();
            }
        }
        return null;
    }

    public V remover(K chave) {
        for (int i = 0; i < lista.getTamanho(); i++) {
            Associacao<K, V> assoc = lista.buscaPorPosicao(i);

            if (assoc.getChave().equals(chave)) {
                V valor = assoc.getValue();
                lista.remove(i);
                return valor;
            }
        }
        return null;
    }

    public boolean estaVazio() {
        return lista.getTamanho() == 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mapa{");
        sb.append("lista=").append(lista);
        sb.append('}');
        return sb.toString();
    }
}