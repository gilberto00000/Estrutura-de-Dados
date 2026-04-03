import exercicio001.Aluno;
import exercicio001.ListaDeChamada;

void main() {
    ListaDeChamada<Aluno> lista = new ListaDeChamada<>();

    lista.adicionar(new Aluno("Eliza", "1"));
    lista.adicionar(new Aluno("Alexandre", "2"));
    lista.adicionar(new Aluno("Dudao", "3"));
    lista.adicionar(new Aluno("Lucio", "4"));
    lista.adicionar(new Aluno("Nayanne", "5"));

    System.out.println("=== Lista de Alunos ===");
    lista.mostrar();

    System.out.println("\nPrimeiro aluno:");
    System.out.println(lista.pegaPrimeiro());

    System.out.println("\nÚltimo aluno:");
    System.out.println(lista.pegaUltimo());

    System.out.println("\nTotal de alunos:");
    System.out.println(lista.getTamanho());
}

