/**
 * A classe {@code FuncionarioTemporario} representa um funcionário com contrato temporário.
 *
 * Essa classe estende {@code Funcionario} e sobrescreve o método {@code calcularSalario()}
 * para aplicar uma dedução fixa ao salário base.
 *
 * A dedução simulada é de R$ 100,00.
 *
 * @author José Otávio
 */
public class FuncionarioTemporario extends Funcionario {

    /**
     * Construtor da classe {@code FuncionarioTemporario}.
     *
     * @param n o nome do funcionário temporário
     */
    public FuncionarioTemporario(String n) {
        super(n);
    }

    /**
     * Calcula o salário do funcionário temporário com uma dedução de R$ 100,00.
     *
     * @return o salário final com a dedução aplicada
     */
    @Override
    public double calcularSalario() {
        return this.salarioBase - 100.0;
    }
}
