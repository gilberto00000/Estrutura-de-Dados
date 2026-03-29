package Questao004;
public class MainS {
    public static void main(String[] args) {

        SisAtendimento sistema = new SisAtendimento();

        sistema.adicionar(new Pessoa("P1", "prioritaria"));
        sistema.adicionar(new Pessoa("P2", "prioritaria"));
        sistema.adicionar(new Pessoa("P3", "prioritaria"));
        sistema.adicionar(new Pessoa("P4", "prioritaria"));
        sistema.adicionar(new Pessoa("N1", "normal"));
        sistema.adicionar(new Pessoa("N2", "normal"));
        sistema.adicionar(new Pessoa("N3", "normal"));
        sistema.adicionar(new Pessoa("P5", "prioritaria"));
        sistema.adicionar(new Pessoa("P6", "prioritaria"));
        sistema.adicionar(new Pessoa("P7", "prioritaria"));

        sistema.atender();
    }
}