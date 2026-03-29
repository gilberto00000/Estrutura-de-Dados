package Questao001;
public class Impressao{
    void main(){
        Fila<Documento> impress = new Fila<>(5);

        impress.adiciona(new Documento("Josrnal", 8));
        impress.adiciona(new Documento("Nacional", 7));
        impress.adiciona(new Documento("TV siqueira", 6));
        impress.adiciona(new Documento("Donos da bola", 4));
        impress.adiciona(new Documento("Corinthians", 100));

        System.out.println(impress);

        impress.desenfileirar();

        System.out.println(impress);


    }
}


