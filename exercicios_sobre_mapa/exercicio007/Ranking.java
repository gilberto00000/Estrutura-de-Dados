public class Ranking {

    Jogador[] jogadores = new Jogador[10];
    int tamanho = 0;

    public void inserir(String nome, int pontos) {
        jogadores[tamanho] = new Jogador(nome, pontos);
        tamanho++;
    }

    public void atualizar(String nome, int pontos) {
        for (int i = 0; i < tamanho; i++) {
            if (jogadores[i].nome.equals(nome)) {
                jogadores[i].pontuacao = pontos;
                return;
            }
        }
        System.out.println("Jogador não encontrado!");
    }

    public void exibir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(jogadores[i].nome + " → " + jogadores[i].pontuacao);
        }
    }

    public void maiorPontuacao() {
        Jogador maior = jogadores[0];

        for (int i = 1; i < tamanho; i++) {
            if (jogadores[i].pontuacao > maior.pontuacao) {
                maior = jogadores[i];
            }
        }

        System.out.println("Maior pontuação: " + maior.nome + " → " + maior.pontuacao);
    }
}