package Questao005;
public class MainP {
    public static void main(String[] args) {

        Fila fila = new Fila(10);

        fila.enfileirar(new Paciente("Ana", 2));
        fila.enfileirar(new Paciente("Carlos", 1));
        fila.enfileirar(new Paciente("Maria", 3));
        fila.enfileirar(new Paciente("João", 1));
        fila.enfileirar(new Paciente("José", 2));
        fila.enfileirar(new Paciente("Alexandre", 3));

        System.out.println("Atendimentos:");

        while (!fila.estaVazia()) {
            Paciente p = fila.atender();
            System.out.println("Atendido: " + p);
        }
    }
}