import Parte1.Vetor;
//            ---------------1. Implementar uma pilha---------------"
public class Pilha<T>{
    private T[] elementos;
    private int tamanho;

    public Pilha(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    public void empilha(T elemento){
        this.elementos[tamanho] = elemento;
        tamanho++;
    }

    public boolean esta_vazio(){
        return tamanho == 0;
    }

    public T desempilha(){
        if (esta_vazio()) {
            return null;
        }
        T temporaria = elementos[tamanho - 1];
        elementos[tamanho - 1] = null;
        tamanho--;
        return temporaria;
    }

    public T topo(){
        return elementos[tamanho-1];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < tamanho; i++) {
            sb.append(elementos[i]);
            if (i < tamanho - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void inverter(){
    
        for (int i = tamanho - 1; i >= 0; i--) {
            System.out.print(elementos[i]);
        }
        System.out.println();
        
    }


}