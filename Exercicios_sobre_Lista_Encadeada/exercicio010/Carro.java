package exercicio010;

public class Carro {
    String placa;
    String modelo;

    public Carro(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public String toString() {
        return placa + " - " + modelo;
    }
}