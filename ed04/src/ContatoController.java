import java.util.ArrayList;
import java.util.List;

/**
 * Classe {@code ContatoController} responsável por gerenciar uma lista de contatos.
 * Permite adicionar, remover, listar e acessar os contatos armazenados.
 *
 * <p>Essa classe funciona como um controlador para objetos que implementam a interface {@code Contato}.</p>
 *
 * @author José Otávio
 */
public class ContatoController {

    /** Lista de contatos gerenciados pelo controlador. */
    private List<Contato> contatos;

    /**
     * Construtor da classe {@code ContatoController}.
     * Inicializa a lista de contatos como uma {@code ArrayList}.
     */
    public ContatoController() {
        contatos = new ArrayList<>();
    }

    /**
     * Adiciona um novo contato à lista.
     *
     * @param c Objeto que implementa a interface {@code Contato}.
     */
    public void adicionar(Contato c) {
        contatos.add(c);
    }

    /**
     * Remove um contato da lista com base no nome (ignora maiúsculas/minúsculas).
     *
     * @param nome Nome do contato a ser removido.
     */
    public void remover(String nome) {
        contatos.removeIf(c -> c.getNome().equalsIgnoreCase(nome));
    }

    /**
     * Lista todos os contatos cadastrados.
     * Imprime as informações no console.
     */
    public void listar() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
        } else {
            for (Contato c : contatos) {
                System.out.println("Nome: " + c.getNome());
                System.out.println("Telefone: " + c.getTelefone());
                System.out.println("Email: " + c.getEmail());
                System.out.println("-------------------------");
            }
        }
    }

    /**
     * Retorna a lista completa de contatos.
     *
     * @return Lista de objetos {@code Contato}.
     */
    public List<Contato> getContatos() {
        return contatos;
    }
}
