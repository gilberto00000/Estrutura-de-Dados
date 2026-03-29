package Questao007;

public class Fila {

    private Chamada [] fila;
    private int tamanho;

    public Fila(int capacidade) {
        fila = new Chamada[];
        tamanho = 0;
    }

    public void enfilerar(Chamada c) {
        fila[tamanho] = c;
        tamanho++;

    }

    public Chamada atender(){
        if (tamanho = 0) return  null;

        Chamada c = fila[0];

        for (int = 0; i < tamanho -1; i++){
            fila[i] = fila[i + 1]
        }

        tamanho --;

        return c;

    }

    public Chamada proxima(){
        if (tamanho = 0) return null;
        return fila[0]
    }

    public int quantidade(){
        return tamanho;
    }






}