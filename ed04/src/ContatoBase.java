/**
 * Classe abstrata {@code ContatoBase} que serve como base para tipos de contatos.
 * Implementa a interface {@code Contato} e fornece atributos e métodos comuns
 * como nome, telefone e email.
 *
 * <p>Subclasses como {@code PessoaFisica} e {@code PessoaJuridica} devem estender esta classe.</p>
 *
 * @author José Otávio
 */
public abstract class ContatoBase implements Contato {

    /** Nome do contato. */
    private String nome;

    /** Telefone do contato. */
    private String telefone;

    /** Email do contato. */
    private String email;

    /**
     * Construtor da classe {@code ContatoBase}.
     *
     * @param no  Nome do contato.
     * @param tel Telefone do contato.
     * @param eml Email do contato.
     */
    ContatoBase(String no, String tel, String eml) {
        this.nome = no;
        this.telefone = tel;
        this.email = eml;
    }

    /**
     * Retorna o nome do contato.
     *
     * @return Nome como uma {@code String}.
     */
    @Override
    public String getNome() {
        return this.nome;
    }

    /**
     * Define o nome do contato.
     * O nome deve ter pelo menos 3 caracteres.
     *
     * @param n Nome a ser atribuído.
     */
    public void setNome(String n) {
        if (n.length() >= 3) {
            this.nome = n;
            System.out.println("Nome adicionado!");
        } else {
            System.out.println("Erro ao adicionar nome.");
        }
    }

    /**
     * Retorna o telefone do contato.
     *
     * @return Telefone como uma {@code String}.
     */
    @Override
    public String getTelefone() {
        return this.telefone;
    }

    /**
     * Define o telefone do contato.
     *
     * @param tel Telefone a ser atribuído.
     */
    public void setTelefone(String tel) {
        this.telefone = tel;
        System.out.println("Telefone adicionado!");
    }

    /**
     * Retorna o email do contato.
     *
     * @return Email como uma {@code String}.
     */
    @Override
    public String getEmail() {
        return this.email;
    }

    /**
     * Define o email do contato.
     *
     * @param eml Email a ser atribuído.
     */
    public void setEmail(String eml) {
        this.email = eml;
    }
}
