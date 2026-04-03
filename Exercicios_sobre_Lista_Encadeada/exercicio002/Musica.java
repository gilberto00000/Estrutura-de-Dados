package exercicio002;

public class Musica {
    String titulo;
    String artista;

    public Musica(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + " | Artista: " + artista;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Musica)) return false;

        Musica outra = (Musica) obj;
        return this.titulo.equals(outra.titulo) &&
                this.artista.equals(outra.artista);
    }
}
