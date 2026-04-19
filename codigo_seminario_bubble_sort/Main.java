public class Main {
    public static void main(String[] args) {

        ListaEncadeada lista = new ListaEncadeada();

        lista.inserir(2);
        lista.inserir(10);
        lista.inserir(6);
        lista.inserir(4);
        lista.inserir(1);

        System.out.println("Lista original:");
        lista.mostrar();

        lista.bubbleSortLista();

        System.out.println("Lista ordenada:");
        lista.mostrar();

        lista.excluirPrimeiro();
        System.out.println("Após excluir primeiro:");
        lista.mostrar();

        lista.excluirUltimo();
        System.out.println("Após excluir último:");
        lista.mostrar();

        lista.excluir(6);
        System.out.println("Após excluir valor 6:");
        lista.mostrar();

        System.out.println("Buscar 10: " + lista.buscar(10));
        System.out.println("Buscar 2: " + lista.buscar(2));
    }
}
