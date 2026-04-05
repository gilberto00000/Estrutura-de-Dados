package exercicio008;

public class Contato {

    private String nome;
    private int telefone;

    public Contato(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return nome + ' - ' + telefone;
    }
}