/**
 * Classe {@code PessoaJuridica} que representa um contato do tipo Pessoa Jurídica.
 * Estende a classe {@code ContatoBase} e adiciona o atributo CNPJ.
 *
 * <p>Essa classe permite o armazenamento e validação de um CNPJ com 14 dígitos.</p>
 *
 * @author José Otávio
 */
public class PessoaJuridica extends ContatoBase {

    /** CNPJ da pessoa jurídica (deve conter 14 dígitos). */
    private String cnpj;

    /**
     * Construtor da classe {@code PessoaJuridica}.
     *
     * @param no  Nome do contato.
     * @param tel Telefone do contato.
     * @param eml Email do contato.
     * @param cn  CNPJ da empresa (deve conter 14 dígitos).
     */
    public PessoaJuridica(String no, String tel, String eml, String cn) {
        super(no, tel, eml);
        this.cnpj = cn;
    }

    /**
     * Retorna o CNPJ da pessoa jurídica.
     *
     * @return CNPJ como uma {@code String}.
     */
    public String getCnpj() {
        return this.cnpj;
    }

    /**
     * Define o CNPJ da pessoa jurídica.
     * O CNPJ só será atribuído se tiver exatamente 14 caracteres.
     *
     * @param cn CNPJ a ser atribuído.
     */
    public void setCnpj(String cn) {
        if (cn.length() == 14) {
            this.cnpj = cn;
            System.out.println("CNPJ adicionado!");
        } else {
            System.out.println("Erro ao adicionar CNPJ, número inválido.");
        }
    }
}

