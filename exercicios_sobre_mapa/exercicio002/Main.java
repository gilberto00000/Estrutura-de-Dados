public class Main{
    public static void main(String[] args) {

        ContPalavras contador = new ContPalavras();

        String frase = "java java mapa lista mapa mapa";

        contador.adicionarFrase(frase);

        System.out.println("Contagem de palavras:");
        contador.exibir();
    }
}