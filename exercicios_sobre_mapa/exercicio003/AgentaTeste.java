public class AgentaTeste {
    void main(){
        Mapa<String, String> agenda = new Mapa<>();

        System.out.println("------------------ Inserindo 4 contatos ------------------");

        agenda.inserir("João", "99999-1111");
        agenda.inserir("Maria", "98888-2222");
        agenda.inserir("Pedro", "97777-3333");
        agenda.inserir("Ana", "96666-4444");

        System.out.println("------------------ Concluido! ------------------");



        System.out.println("------------------ Agenda após inserções ------------------");
        System.out.println(agenda);

        System.out.println("------------------ buscando por chave ------------------");
        String telefone = agenda.buscar("Maria");
        System.out.println("\nTelefone da Maria: " + telefone);

        System.out.println("------------------ removendo por chave ------------------");

        String removido = agenda.remover("Pedro");
        System.out.println("\nContato removido: " + removido);

        System.out.println("\n------------------ Agenda final ------------------");
        System.out.println(agenda);
    }
}
