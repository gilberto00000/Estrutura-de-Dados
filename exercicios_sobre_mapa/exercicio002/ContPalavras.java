public class ContPalavras {

    private String[] palavras = new String[10];
    private int[] contagem = new int[10];
    private int tamanho = 0;

    public void adicionarFrase(String frase) {

        String[] palavrasFrase = frase.split(" ");

        for (int i = 0; i < palavrasFrase.length; i++) {

            String palavraAtual = palavrasFrase[i];
            boolean encontrada = false;

            for (int j = 0; j < tamanho; j++) {
                if (palavras[j].equals(palavraAtual)) {
                    contagem[j]++;
                    encontrada = true;
                    break;
                }
            }

            if (!encontrada) {
                palavras[tamanho] = palavraAtual;
                contagem[tamanho] = 1;
                tamanho++;
            }
        }
    }

    public void exibir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(palavras[i] + " - " + contagem[i]);
        }
    }
}