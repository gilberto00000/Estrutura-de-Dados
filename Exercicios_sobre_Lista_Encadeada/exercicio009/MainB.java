package exercicio009;

public class MainBoletim {
    public static void main(String[] args) {

        ListaDisciplinas lista = new ListaDisciplinas();

        lista.adiciona(new Disciplina("Matemática", 8.5));
        lista.adiciona(new Disciplina("Português", 7.0));
        lista.adiciona(new Disciplina("História", 9.0));
        lista.adiciona(new Disciplina("Geografia", 6.5));
        lista.adiciona(new Disciplina("Física", 8.0));

        System.out.println("=== BOLETIM ===");
        lista.exibir();

        System.out.println("\nDisciplina na posição 2: " + lista.pega(2));
        System.out.println("Tem Física? " + lista.contem("Física"));
        System.out.println("Total de disciplinas: " + lista.getTamanho());
    }
}