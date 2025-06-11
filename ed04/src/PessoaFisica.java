/**
 * Classe {@code PessoaFisica} que representa um contato do tipo Pessoa Física.
 * Estende a classe {@code ContatoBase} e adiciona o atributo CPF.
 *
 * <p>Essa classe permite o armazenamento e validação de um CPF com 11 dígitos.</p>
 *
 * @author José Otávio
 */
public class PessoaFisica extends ContatoBase {

    /** CPF da pessoa física (deve conter 11 dígitos). */
    private String cpf;

    /**
     * Construtor da classe {@code PessoaFisica}.
     *
     * @param no  Nome do contato.
     * @param tel Telefone do contato.
     * @param eml Email do contato.
     * @param cp  CPF da pessoa (deve conter 11 dígitos).
     */
    public PessoaFisica(String no, String tel, String eml, String cp) {
        super(no, tel, eml);
        this.cpf = cp;
    }

    /**
     * Retorna o CPF da pessoa física.
     *
     * @return CPF como uma {@code String}.
     */
    public String getCpf() {
        return this.cpf;
    }

    /**
     * Define o CPF da pessoa física.
     * O CPF só será atribuído se tiver exatamente 11 caracteres.
     *
     * @param cp CPF a ser atribuído.
     */
    public void setCpf(String cp) {
        if (cp.length() == 11) {
            this.cpf = cp;
            System.out.println("CPF adicionado!");
        } else {
            System.out.println("Erro ao adicionar CPF, número inválido.");
        }
    }
}

