public class ListaEncadeada {
        No inicio;

        

        //adiciona no inicio
        public void inserirInicio(int valor) {

            No novo = new No(valor);
            novo.proximo = inicio;
            inicio = novo;

        }

        //adicionar no meio
        public void inserirMeio(int valor, int posicao){

            if(posicao == 0){
                inserirInicio(valor);
                return;
            }

            No atual = inicio;
            int contador = 0

            while (atual != null && contador < posicao -1) {
                atual = atual.proximo;
                contador++;
            }

            if(atual == null){
                System.out.println("Posição inválida")
                return;
            }

            novo.proximo = atual.proximo;
            atual.proximo = novo;

        }
        
        //adicionar ultimo
        public void inserir(int valor) {
            No novo = new No(valor);

            if (inicio == null) {
                inicio = novo;
            } else {
                No atual = inicio;
                while (atual.proximo != null) {
                    atual = atual.proximo;
                }
                atual.proximo = novo;
            }
        }


        

        public void excluirPrimeiro() {
            if (inicio != null) {
                inicio = inicio.proximo;
            }
        }

        public void excluirUltimo() {
            if (inicio == null) return;

            if (inicio.proximo == null) {
                inicio = null;
                return;
            }

            No atual = inicio;
            while (atual.proximo.proximo != null) {
                atual = atual.proximo;
            }

            atual.proximo = null;
        }

        public void excluir(int valor) {
            if (inicio == null) return;

            if (inicio.valor == valor) {
                inicio = inicio.proximo;
                return;
            }

            No atual = inicio;
            while (atual.proximo != null && atual.proximo.valor != valor) {
                atual = atual.proximo;
            }

            if (atual.proximo != null) {
                atual.proximo = atual.proximo.proximo;
            }
        }

        public boolean buscar(int valor) {
            No atual = inicio;

            while (atual != null) {
                if (atual.valor == valor) {
                    return true;
                }
                atual = atual.proximo;
            }

            return false;
        }

    public void bubbleSortLista() {
        if (inicio == null) return;

        boolean trocou = true;

        while (trocou) {
            trocou = false;
            No atual = inicio;

            while (atual.proximo != null) {
                if (atual.valor > atual.proximo.valor) {

                    int temp = atual.valor;
                    atual.valor = atual.proximo.valor;
                    atual.proximo.valor = temp;

                    trocou = true;
                }
                atual = atual.proximo;
            }
        }
    }

        public void mostrar() {
            No atual = inicio;
            while (atual != null) {
                System.out.print(atual.valor + " - ");
                atual = atual.proximo;
            }
            System.out.println("null");
        }
}
