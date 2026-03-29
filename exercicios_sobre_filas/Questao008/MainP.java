package Questao008;

public class MainP {
    public static void main(String[] args) {

        FilaProcesso fila = new FilaProcesso(10);

        fila.adicionar(new Processo(1, 5));
        fila.adicionar(new Processo(2, 3));
        fila.adicionar(new Processo(3, 7));

        System.out.println("Executando: " + fila.atual());
        System.out.println("Finalizado: " + fila.executar());
        System.out.println("Agora executando: " + fila.atual());
    }
}