public class Main {
    public static void main(String[] args) {

        SistemAlunos sistema = new SistemAlunos();

        sistema.inserir(1, "Ana");
        sistema.inserir(2, "José");
        sistema.inserir(3, "Alexandre");
        sistema.inserir(4, "Eliza");
        sistema.inserir(5, "Gabrielly");

        System.out.println("Lista de alunos:");
        sistema.exibir();

        System.out.println("Buscando matrícula 3:");
        String nome = sistema.buscar(3);
        if (nome != null) {
            System.out.println("Encontrado: " + nome);
        } else {
            System.out.println("Não encontrado");
        }

        System.out.println("Removendo matrícula 2:");
        if (sistema.remover(2)) {
            System.out.println("Removido com sucesso");
        } else {
            System.out.println("Não encontrado");
        }

        System.out.println("Lista atualizada:");
        sistema.exibir();
    }
}