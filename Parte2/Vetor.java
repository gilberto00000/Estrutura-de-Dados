package Parte2;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        elementos = new String[capacidade];
        tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void adicionar(String elemento) {
        elementos[tamanho] = elemento;
        tamanho++;
    }

    public void saida() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(elementos[i] + " ");
        }
    }

    public int indiceU(String elemento) {
        for (int i = tamanho-1; i>=0; i--) {
            if(elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public boolean remover(String elemento) {
        for (int i = 0; i < tamanho; i++) {
            if(elementos[i].equals(elemento)) {
                for (int j = i; j < tamanho; j++) {
                    elementos[j] = elementos[j+1];
                }
                tamanho--;
                return true;
            }
        }
        return false;
    }

    public void removeT(String elemento) {
        while(remover(elemento)) {

        }
    }

    public boolean addSeNaoExiste(String elemento){
        boolean existe = false;
        for (String nome : elementos) {
            if (nome == elemento) {
                existe = true;
                break;
            }
        }
        if (existe == false){
            adicionar(elemento);
            return true;
        }
        return false;
    }

    public boolean inserirDepois(String elementoExistente, String elementoNovo){
        for (int i = tamanho - 1; i >= indiceU(elementoExistente) ; i--) {
            elementos[i+1] = elementos[i];
        }
        elementos[indiceU(elementoExistente)-1] = elementoNovo;
        tamanho++;

        return true;
    }

    public void remove(int posicao){
        if (posicao < 0 || posicao >= tamanho){
            throw new IllegalArgumentException("Posição invalida");
        }
        for (int i = posicao; i < tamanho - 1; i++){
            elementos[i] = elementos[i + 1];
        }
        tamanho --;

        elementos[tamanho] = null;
    }

    public boolean remove(String elemento) {
        int posicao = indiceU(elemento);
        if (posicao == -1){
            return false;
        }
        remove(posicao);
        return true;
    }


    // Questões 7 8 e 9







}