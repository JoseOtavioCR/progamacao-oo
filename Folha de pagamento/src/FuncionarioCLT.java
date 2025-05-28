/**
 * A classe {@code FuncionarioCLT} representa um funcionário contratado sob regime CLT.
 *
 * Essa classe estende {@code Funcionario} e sobrescreve o método {@code calcularSalario()}
 * para adicionar um valor fixo ao salário base.
 *
 * O valor adicional representado é de R$ 300,00.
 *
 * @author José Otávio
 */
public class FuncionarioCLT extends Funcionario {

    /**
     * Construtor da classe {@code FuncionarioCLT}.
     *
     * @param n o nome do funcionário CLT
     */
    public FuncionarioCLT(String n) {
        super(n);
    }

    /**
     * Calcula o salário do funcionário CLT adicionando R$ 300,00 ao salário base.
     *
     * @return o salário final com o adicional aplicado
     */
    @Override
    public double calcularSalario() {
        return this.salarioBase + 300.0;
    }
}

