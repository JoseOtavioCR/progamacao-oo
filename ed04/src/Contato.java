/**
 * Interface {@code Contato} que define os métodos básicos para um contato.
 *
 * <p>Deve ser implementada por classes que representam diferentes tipos de contato,
 * como {@code PessoaFisica} e {@code PessoaJuridica}.</p>
 *
 * <p>Fornece métodos para acessar nome, telefone e email do contato.</p>
 *
 * @author José Otávio
 */
public interface Contato {

    /**
     * Retorna o nome do contato.
     *
     * @return Nome como uma {@code String}.
     */
    String getNome();

    /**
     * Retorna o telefone do contato.
     *
     * @return Telefone como uma {@code String}.
     */
    String getTelefone();

    /**
     * Retorna o email do contato.
     *
     * @return Email como uma {@code String}.
     */
    String getEmail();
}

