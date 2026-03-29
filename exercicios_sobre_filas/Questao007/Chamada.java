package Questao007;

public class Chamada {

    private String nome;
    private String Assunto;

    public Chamada(String nome, String assunto) {
        this.nome = nome;
        Assunto = assunto;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Chamada{" +
                "nome='" + nome + '\'' +
                ", Assunto='" + Assunto + '\'' +
                '}';
    }
}