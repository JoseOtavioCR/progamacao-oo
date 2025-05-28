/**
 * A classe abstrata {@code Funcionario} representa um funcionário genérico com nome e salário base.
 *
 * Esta classe serve como superclasse para diferentes tipos de funcionários, como CLT e temporários,
 * e define comportamentos comuns, como exibição de dados e cálculo de salário.
 *
 * As subclasses podem sobrescrever o método {@code calcularSalario()} para aplicar regras específicas.
 *
 * @author José Otávio
 */
public abstract class Funcionario {

    /** O nome do funcionário. */
    protected String nome;

    /** O salário base do funcionário. */
    protected double salarioBase;

    /**
     * Construtor da classe {@code Funcionario}.
     *
     * @param n o nome do funcionário
     */
    public Funcionario(String n) {
        nome = n;
        salarioBase = 2000;
    }

    /**
     * Exibe os dados do funcionário: nome e salário base.
     */
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário base: " + salarioBase);
    }

    /**
     * Calcula o salário do funcionário.
     * Subclasses podem sobrescrever este método para alterar o cálculo.
     *
     * @return o valor do salário (por padrão, o salário base)
     */
    public double calcularSalario() {
        return salarioBase;
    }
}

