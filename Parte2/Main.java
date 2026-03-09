package Parte2;

public class Main {
    public static void main(String[] args) {




        Vetor vetor = new Vetor(10);

        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("B");
        vetor.adicionar("D");
        vetor.adicionar("B");

        System.out.println("Vetor original:");
        vetor.saida();

        // questão 11

        System.out.println("---------------- Questão 11 --------------------");

        Vetor v = new Vetor(10);

        v.adicionar("A");
        v.adicionar("D");
        v.adicionar("E");
        v.adicionar("F");
        v.adicionar("G");

        System.out.println("Vetor inicial");
        v.saida();
        System.out.println("Tamanho: " + v.getTamanho());

        // remove posição 0
        v.remove(0);
        System.out.println("\nDepois de remover posição 0:");
        v.saida();
        System.out.println("Tamanho: " + v.getTamanho());

        // remove posição do meio
        v.remove(3);
        System.out.println("\nDepois de remover posição do meio:");
        v.saida();
        System.out.println("Tamanho: " + v.getTamanho());

        // remove última posição
        v.remove(v.getTamanho() - 1);
        System.out.println("\nDepois de remover última posição:");
        v.saida();
        System.out.println("Tamanho: " + v.getTamanho());

        // teste inválido
        // v.remove(99);


        // questão 12

        System.out.println("---------------- Questão 12 --------------------");

        Vetor v1 = new Vetor(10);

        v1.adicionar("A");
        v1.adicionar("B");
        v1.adicionar("C");
        v1.adicionar("B");
        v1.adicionar("D");

        System.out.println("Vetor inicial:");
        v.saida();

        boolean removido = v.remove("B");

        System.out.println("\nRemovendo B: " + removido);
        v.saida();

        boolean removido2 = v.remove("X");

        System.out.println("\nRemovendo X: " + removido2);
        v.saida();

        // questão 13

        System.out.println("---------------- Questão 13 --------------------");

        System.out.println("Ultimo indice de B: ");
        System.out.println(vetor.indiceU("B"));

        // questão 14

        System.out.println("---------------- Questão 14 --------------------");

        System.out.println("Agora será removido todos os B");
        vetor.removeT("B");

        System.out.println("\nVetor depois de remover todos os B: ");
        vetor.saida();

        // questão 15

        System.out.println("---------------- Questão 15 --------------------");

        Vetor q15 = new Vetor(7);

        q15.addSeNaoExiste("a");
        q15.addSeNaoExiste("a");
        q15.addSeNaoExiste("b");
        q15.addSeNaoExiste("b");
        q15.addSeNaoExiste("c");
        q15.addSeNaoExiste("c");
        q15.addSeNaoExiste("c");
        q15.addSeNaoExiste("c");
        q15.addSeNaoExiste("c");
        q15.saida();

        // questão 16

        System.out.println("---------------- Questão 16 --------------------");

        Vetor q16 = new Vetor(10);

        q16.adicionar("a");
        q16.adicionar("c");
        q16.adicionar("d");
        q16.adicionar("e");
        q16.adicionar("f");

        q16.inserirDepois("c", "b");

        q16.saida();

    }
}

