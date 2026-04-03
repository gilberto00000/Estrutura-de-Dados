public class MainN {
    public static void main(String[] args) {

        Lista historico = new Lista();

        historico.adicionar(new Pagina("eliza", "www.eliza.com"));
        historico.adicionar(new Pagina("gilberto", "www.gilberto.com"));
        historico.adicionar(new Pagina("alexandre", "www.alexandre.com"));
        historico.adicionar(new Pagina("jose", "www.Jose.com"));
        historico.adicionar(new Pagina("moreira", "www.Moreira.com"));
        historico.adicionar(new Pagina("gabrielly", "www.Gabrielly.com"));
        historico.adicionar(new Pagina("123", "www.123.com"));
        historico.adicionar(new Pagina("net", "www.net.com"));

        System.out.println("Histórico:");
        historico.exibir();

        System.out.println("Visitou Google?");
        System.out.println(historico.contem("Google"));

        System.out.println("Última página visitada:");
        System.out.println(historico.pegaUltimo());

        System.out.println("Total de páginas:");
        System.out.println(historico.getTamanho());
    }
}