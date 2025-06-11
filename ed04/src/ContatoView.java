import java.util.List;

/**
 * Classe {@code ContatoView} responsável por exibir informações ao usuário.
 *
 * <p>Apresenta o menu da aplicação e mostra os contatos cadastrados na interface de console.</p>
 *
 * <p>Essa classe atua como a camada de visualização (View) no padrão MVC.</p>
 *
 * @author José Otávio
 */
public class ContatoView {

    /**
     * Exibe o menu principal da aplicação no console.
     */
    public void exibirMenu() {
        System.out.println("MENU:");
        System.out.println("1 - Adicionar Contato");
        System.out.println("2 - Listar Contatos");
        System.out.println("3 - Sair");
    }

    /**
     * Exibe no console a lista de contatos fornecida.
     *
     * @param contatos Lista de objetos que implementam a interface {@code Contato}.
     */
    public void mostrarContatos(List<Contato> contatos) {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato para exibir.");
        } else {
            for (Contato c : contatos) {
                System.out.println("Nome: " + c.getNome());
                System.out.println("Telefone: " + c.getTelefone());
                System.out.println("Email: " + c.getEmail());
                System.out.println("----------------------------");
            }
        }
    }
}
