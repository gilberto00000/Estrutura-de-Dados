public class Main {
    public static void main(String[] args) {
        
        
        
        
        
        System.out.println("---------------2. Testando a pilha---------------");

        Pilha<String> pilha = new Pilha<>(3);

        pilha.empilha("A");
        pilha.empilha("B");
        pilha.empilha("C");

        System.out.println("Topo: " + pilha.topo());
        System.out.println("Removido: "+ pilha.desempilha());
        System.out.println("Topo: "+ pilha.topo());


        System.out.println("---------------3. Mostrar elementos da pilha---------------");

        System.out.println(pilha);


        System.out.println("---------------4. Inverter uma palavra---------------");


        Pilha<String> pilha2 = new Pilha<>(5);
        pilha2.empilha("h");
        pilha2.empilha("e");
        pilha2.empilha("l");
        pilha2.empilha("l");
        pilha2.empilha("o");

        pilha2.inverter();


        String palavra = "arara";
        String palavra2 = "casa";


        System.out.println("---------------5. Verificar palíndromo---------------");

        System.out.println(Palindromo.verificar_palindromo(palavra) ? palavra + " é um palíndromo" : palavra + " não é um palíndromo");
        System.out.println(Palindromo.verificar_palindromo(palavra2) ? palavra2 + " é um palíndromo" : palavra2 + " não é um palíndromo");


        System.out.println("---------------6. Inverter a ordem das palavras---------------");


        String frase = "eu gosto de java";
        String[] palavras = frase.split(" ");

        Pilha pilha3 = new Pilha(palavras.length);

        for (int i = 0; i < palavras.length; i++) {
            pilha3.empilha(palavras[i]);
        }

        while(!pilha3.esta_vazio()) {
            System.out.print(pilha3.desempilha() +" ");
        }
        
    }


}