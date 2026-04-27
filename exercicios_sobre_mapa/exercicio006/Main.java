public class Main {

    public static void main(String[] args) {

        Mapa mapa = new Mapa();

        mapa.inserir(1, "A");
        mapa.inserir(2, "B");
        mapa.inserir(3, "C");

        System.out.println("Mapa original:");
        mapa.exibir();

        System.out.println("\nMapa invertido:");
        mapa.inverter();
    }
}