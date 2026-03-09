package Parte1;
import java.util.Arrays;

public class Vetor {
    private int tamanho;
    private String[] elementos;

    public Vetor(int capacidade){
        this.tamanho = 0;
        this.elementos =  new String[capacidade];
    }

    public int getTamanaho() {
        return tamanho;
    }

    public boolean adicionar(String nome){
        if (tamanho < elementos.length){
            elementos[tamanho] = nome;
            tamanho++;
            return true;
        }   else {
            return false;
        }
    }

    public void mostrarElementos(){
        for (String nome:elementos){
            if (nome !=null){
                System.out.println(nome);
            }
        }
    }

    public boolean estaVazio(){
        if (tamanho <= 0){
            return true;
        }else{
            return false;
        }
    }
    public String mostrarUltimo(){
        if (tamanho <= 0) {
            throw new IllegalStateException("O vetor está vazio");
        }else {
            for (int i = 0; i < elementos.length ; i++) {
                if (elementos[i]==null){
                    return elementos[i-1];
                }

            }

        }
        return " ";
    }

    public void testeLimpar(){
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i]!=null){
                elementos[i] = null;
            }
            tamanho = 0;
        }
    }

    public void contarOcorrencia(){

        boolean[] jaContado = new boolean[elementos.length];

        for (int i = 0; i < elementos.length ; i++) {

            if (jaContado[i]){
                continue;
            }

            int contar = 1;

            for (int j = i + 1; j < elementos.length ; j++) {
                if(elementos[i] == null){
                    continue;
                }else if(elementos[i].equals(elementos[j])){
                    contar++;
                    jaContado[j] = true;
                }
            }
            if (elementos[i] == null){

            }else{
                System.out.println(elementos[i] + " ("+ contar + ")");
            }
        }
    }
    public void substituirPorString(String atual, String novo){
        for (int i = 0; i < elementos.length ; i++) {
            if (elementos[i] == null){
                continue;
            }
            else if (elementos[i].equals(atual) ){
               elementos[i] = novo;
            }
        }
    }
    public boolean substituirPorId(int atual, String novo){
        for (int i = 0; i < elementos.length ; i++) {
            if (i == atual){
                if (elementos[i] == null){
                    return false;
                }else{
                    elementos[i] = novo;
                    return true;
                }
            }
        }
        return false;
    }

    public int buscarS(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(nome)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contemS(String nome) {
        return buscarS(nome)!= -1;
    }

    @Override
    public String toString() {
        return "Vetor{" +
                "tamanho=" + tamanho +
                ", elementos=" + Arrays.toString(elementos) +
                '}';
    }
}