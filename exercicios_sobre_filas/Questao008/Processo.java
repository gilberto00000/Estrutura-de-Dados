package Questao008;

class Processo {
    int id;
    int tempo;

    public Processo(int id, int tempo) {
        this.id = id;
        this.tempo = tempo;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Processo{" +
                "id=" + id +
                ", tempo=" + tempo +
                '}';
    }
}