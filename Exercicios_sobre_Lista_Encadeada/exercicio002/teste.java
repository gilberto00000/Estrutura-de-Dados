package exercicio002;

public class teste {
    void main(){

        ListaEncadeada<Musica> playlist = new ListaEncadeada<>();

        playlist.adicionar(new Musica("Bebe e vem me procurar", "Turma do pagode"));
        playlist.adicionar(new Musica("Quem ama sente saudade", "Turma do pagode"));
        playlist.adicionar(new Musica("Chuva de Arroz", "Luan Santana"));
        playlist.adicionar(new Musica("Imprevistos", "Pablo"));
        playlist.adicionar(new Musica("Cara da serenata", "Luccas & Rodrigo, Luan Pereira, Vitor e Luan"));
        playlist.adicionar(new Musica("Quem é você?", "Akashi Cruz"));

        System.out.println("=== Playlist ===");
        playlist.mostrar();

        System.out.println("\nVerificando música...");
        Musica busca = new Musica("Quem é você?", "Akashi Cruz");

        if (playlist.contem(busca)) {
            System.out.println("Música encontrada! " + busca);
        } else {
            System.out.println("Música NÃO encontrada.");
        }

        System.out.println("\nTotal de músicas:");
        System.out.println(playlist.getTamanho());
    }
}

