public class Palindromo {
    public static boolean verificar_palindromo(String palavra) {
        Pilha<Character> pilha = new Pilha<>(palavra.length());

        for (char letra : palavra.toCharArray()) {
            pilha.empilha(letra);
        }

        for (char letra : palavra.toCharArray()) {
            if (letra != pilha.desempilha()) {
                return false;
            }
        }

        return true;
    }
}
