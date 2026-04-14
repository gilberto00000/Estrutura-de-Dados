void main() {

    int[] teste = new int[5];

    teste[0] = 2;
    teste[1] = 10;
    teste[2] = 6;
    teste[3] = 4;
    teste[4] = 1;

    for (int i = 0; i < teste.length; i++) {
        System.out.println(teste[i]);
    }

    Bubble.bubble(teste);
    System.out.println();
    System.out.println("/////////////// VERIFICANDO ////////////////");
    System.out.println();

    for (int i = 0; i < teste.length; i++) {
        System.out.println(teste[i]);
    }

}
