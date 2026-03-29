package Questao007;

public class MainC {
    public static void main(String[] args) {

        Fila fila = new Fila(10);

        fila.enfileirar(new Chamada("João", "Suporte"));
        fila.enfileirar(new Chamada("Maria", "Financeiro"));
        fila.enfileirar(new Chamada("Pedro", "Dúvida"));

        System.out.println("Próxima: " + fila.proxima());
        System.out.println("Atendendo: " + fila.atender());
        System.out.println("Restantes: " + fila.quantidade());
    }

}

