class Convidado {
    String nome;
    String cpf;

    public Convidado(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf;
    }
}