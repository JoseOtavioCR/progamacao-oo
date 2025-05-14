/**
 * Representa uma conta corrente, que é um tipo específico de {@link Conta}.
 *
 * <p>A conta corrente aplica uma taxa de juros diária reduzida em relação à conta padrão
 * e inclui a identificação do tipo da conta no extrato.</p>
 *
 * @see Conta
 * @see ContaPoupanca
 * @see ContaSalario
 *
 * @author Você
 */
public class ContaCorrente extends Conta {

    /**
     * Construtor da classe ContaCorrente.
     *
     * @param cliente Nome do titular da conta
     * @param saldoInicial Valor inicial do saldo da conta
     */
    public ContaCorrente(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    /**
     * Aplica uma taxa de juros diária de 10% sobre o saldo atual da conta.
     * <p>Este método sobrescreve o método {@code aplicarJurosDiarios} da classe {@link Conta}.</p>
     */
    @Override
    public void aplicarJurosDiarios() {
        double juros = saldo * 0.1;
        saldo += juros;  // Aplica o juros
        System.out.println("Juros de Conta Corrente aplicado com sucesso!");
        transacoes.add("Aplicação de juros Conta Corrente: R$" + juros);
    }

    /**
     * Imprime no console o extrato da conta corrente, incluindo as transações
     * realizadas, o tipo da conta e o saldo atual.
     * <p>Este método sobrescreve {@link Conta#imprimirExtrato()}.</p>
     */
    @Override
    public void imprimirExtrato() {
        System.out.println("\nExtrato da conta de " + cliente + ":");
        System.out.println("\nConta tipo: Corrente");
        for (String transacao : transacoes) {
            System.out.println("- " + transacao);
        }
        System.out.println("Saldo atual: R$" + saldo);
    }
}
