public class Mapa {


    Associacao[] dados = new Associacao[10];
    int tamanho = 0;

    public void inserir(int chave, String valor) {
        dados[tamanho] = new Associacao(chave, valor);
        tamanho++;
    }

    public void exibir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(dados[i].chave + " → " + dados[i].valor);
        }
    }

    public void inverter() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(dados[i].valor + " → " + dados[i].chave);
        }
    }
}