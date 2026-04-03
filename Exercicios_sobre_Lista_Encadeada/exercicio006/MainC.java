public class MainC {
    public static void main(String[] args) {

        Lista lista = new Lista();

        lista.adicionar(new Convidado("Alexandre", "147852"));
        lista.adicionar(new Convidado("Bruno", "789987"));
        lista.adicionar(new Convidado("Gilberto", "654565"));
        lista.adicionar(new Convidado("Eliza", "321654"));
        lista.adicionar(new Convidado("Jose", "123445"));
        lista.adicionar(new Convidado("Gabrielly", "789456"));

        System.out.println("Lista de convidados:");
        lista.exibir();

        System.out.println("Convidado com CPF 789456 está na lista?");
        System.out.println(lista.contem("789456"));

        System.out.println("Total de convidados:");
        System.out.println(lista.getTamanho());
    }
}