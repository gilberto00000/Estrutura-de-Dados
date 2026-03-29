package Questao002;

public class Fila <T>{
    private T elementos[];
    private int tamanho;

    public Fila(int capaci) {
        this.elementos = (T[]) new Object[capaci];
        tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void adiciona(T elemento){
        this.elementos[tamanho] = elemento;
        tamanho++;
    }

    public T desenfileirar(){
        T removido = elementos[0];
        for (int i = 0; i < tamanho -1; i++) {
            elementos[i] = elementos[i +1];
        }
        tamanho --;
        return removido;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            sb.append(elementos[i]).append("\n");
        }
        return sb.toString();
    }
}
