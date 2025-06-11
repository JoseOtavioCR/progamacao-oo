/**
 * Classe {@code Agenda} que representa o ponto de entrada da aplicação.
 *
 * <p>Cria instâncias de {@code PessoaFisica} e {@code PessoaJuridica}, 
 * adiciona os contatos ao {@code ContatoController} e utiliza a {@code ContatoView}
 * para exibir informações ao usuário.</p>
 *
 * <p>Este é o método principal da aplicação.</p>
 *
 * @author José Otávio
 */
public class Agenda {

    /**
     * Método principal que inicializa a aplicação.
     *
     * @param args Argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        ContatoController controller = new ContatoController();
        ContatoView view = new ContatoView();

        // Criando contatos
        PessoaFisica pf = new PessoaFisica("João", "1234-5678", "joao@email.com", "123.456.789-00");
        PessoaJuridica pj = new PessoaJuridica("Empresa X", "9999-8888", "contato@empresa.com", "12.345.678/0001-00");

        // Adicionando contatos ao controller
        controller.adicionar(pf);
        controller.adicionar(pj);

        // Exibindo menu e listando contatos
        view.exibirMenu();
        view.mostrarContatos(controller.getContatos());
    }
}
