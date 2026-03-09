package Parte1;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //teste vetor 1

        Vetor v1 = new Vetor(8);

        v1.adicionar("antigo");
        v1.adicionar("2");
        v1.adicionar("3");
        System.out.println("-------------------------------------------------");
        v1.mostrarElementos();
        System.out.println();
        System.out.println(v1);
        System.out.println();
        System.out.println(v1.getTamanaho());
        System.out.println("-------------------------------------------------");

        //teste vetor2

        Vetor vetorS = new Vetor(10);

        vetorS.adicionar("Alexandre");
        vetorS.adicionar("Eliza");
        vetorS.adicionar("Gilberto");
        vetorS.adicionar("José");

        System.out.println("Indice do nome Gilberto: " + vetorS.buscarS("Gilberto"));
        System.out.println("Contem o nome Alexandre? "+ vetorS.contemS("Alexandre"));
        System.out.println();

        System.out.println(vetorS.mostrarUltimo());
        System.out.println("-------------------------------------------------");

        //teste vetor 3

            Vetor vetor = new Vetor(5);
        try{
            System.out.println(vetor.mostrarUltimo());
        } catch (Exception e) {
            System.out.println("Erro: "+ e.getMessage());
        }

        vetor.adicionar("anome");
        vetor.adicionar("nome");
        vetor.adicionar("bnome");



        System.out.println("Ultimo elemento: "+ vetor.mostrarUltimo());

        System.out.println("-------------------------------------------------");


        // teste limpar


        Vetor v3 = new Vetor(3);
        v3.adicionar("3");
        v3.adicionar("4");
        v3.adicionar("5");
        v3.mostrarElementos();
        System.out.println("-------------------------------------------------");
        v3.testeLimpar();
        v3.mostrarElementos();
        System.out.println("-------------------------------------------------");

        //teste ocorrencias

        v1.contarOcorrencia();
        System.out.println("-------------------------------------------------");

        //teste substituir

        System.out.println(v1.substituirPorId(0, "novo"));
        System.out.println("-------------------------------------------------");
        v1.mostrarElementos();
        System.out.println("-------------------------------------------------");
        System.out.println(v1.substituirPorId(7, "fato"));
        System.out.println("-------------------------------------------------");
        v1.substituirPorString("3", "substituto");
        v1.mostrarElementos();
    }
}

