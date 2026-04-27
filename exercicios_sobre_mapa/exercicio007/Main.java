public class Main {

    public static void main(String[] args) {

        Ranking ranking = new Ranking();

        ranking.inserir("Ana", 50);
        ranking.inserir("João", 80);
        ranking.inserir("Pedro", 70);
        ranking.inserir("Maria", 90);

        ranking.atualizar("Ana", 100);

        System.out.println("Ranking:");
        ranking.exibir();

        ranking.maiorPontuacao();
    }
}