public class FrequenciaTeste {
    void main(){
        int[] notas = {7, 8, 7, 10, 8, 7};

        Mapa<Integer, Integer> frequencia = new Mapa<>();

        for (int nota : notas){
            Integer quantidade = frequencia.buscar(nota);
            if (quantidade == null) {
                frequencia.inserir(nota, 1);
            }else {
                frequencia.inserir(nota, quantidade + 1);
            }
        }

        System.out.println(frequencia);
    }
}
