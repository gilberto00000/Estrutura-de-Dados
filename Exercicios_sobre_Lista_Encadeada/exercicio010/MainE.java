package exercicio010;

public class MainE {
    public static void main(String[] args) {

        ListaCarros lista = new ListaCarros();

        lista.adiciona(new Carro("ABC-1234", "Gol"));
        lista.adiciona(new Carro("DEF-5678", "Onix"));
        lista.adiciona(new Carro("GHI-9012", "HB20"));
        lista.adiciona(new Carro("JKL-3456", "Corolla"));
        lista.adiciona(new Carro("MNO-7890", "Civic"));

        System.out.println("=== CARROS ESTACIONADOS ===");
        lista.exibir();

        System.out.println("\nTem placa ABC-1234? " + lista.contem("ABC-1234"));
        System.out.println("Primeiro carro: " + lista.pegaPrimeiro());
        System.out.println("Último carro: " + lista.pegaUltimo());
    }
}