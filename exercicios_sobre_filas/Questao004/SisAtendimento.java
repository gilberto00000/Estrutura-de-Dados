package Questao004;
public class SisAtendimento {
    private Fila filaPrioritaria = new Fila(10);
    private Fila fila = new Fila(10);

    private int contPrioritario = 0;

    public void adicionar(Pessoa p) {
        if(p.getTipo().equals("prioritaria")) {
            filaPrioritaria.enfileirar(p);
        } else {
            fila.enfileirar(p);
        }
    }

    public void atender() {
        System.out.println("Ordem:");

        while (!filaPrioritaria.estaVazia() || !fila.estaVazia()) {

            int atendidos = 0;

            while (atendidos < 3 && !filaPrioritaria.estaVazia()) {
                Pessoa p = filaPrioritaria.desenfileirar();
                System.out.println(p);
                atendidos++;
            }

            if (!fila.estaVazia()) {
                Pessoa p = fila.desenfileirar();
                System.out.println(p);
            }
        }
    }
}