public class SistemAlunos {

    private int[] matriculas = new int[10];
    private String[] nomes = new String[10];
    private int tamanho = 0;

    public void inserir(int matricula, String nome) {
        matriculas[tamanho] = matricula;
        nomes[tamanho] = nome;
        tamanho++;
    }

    public String buscar(int matricula) {
        for (int i = 0; i < tamanho; i++) {
            if (matriculas[i] == matricula) {
                return nomes[i];
            }
        }
        return null;
    }

    public boolean remover(int matricula) {
        for (int i = 0; i < tamanho; i++) {
            if (matriculas[i] == matricula) {
                for (int j = i; j < tamanho - 1; j++) {
                    matriculas[j] = matriculas[j + 1];
                    nomes[j] = nomes[j + 1];
                }
                tamanho--;
                return true;
            }
        }
        return false;
    }

    public void exibir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(matriculas[i] + "  " + nomes[i]);
        }
    }
}