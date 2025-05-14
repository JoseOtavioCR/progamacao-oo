/**
 * Representa uma conta poupança, que é um tipo específico de {@link Conta}.
 *
 * A conta poupança aplica uma taxa de juros diária de 8% sobre o saldo
 * e inclui a identificação do tipo da conta no extrato.
 *
 * @see Conta
 * @see ContaCorrente
 * @see ContaSalario
 *
 * @author José Otávio
 */
public class ContaPoupanca extends Conta {

    /**
     * Construtor da classe ContaPoupanca.
     *
     * @param cliente Nome do titular da conta
     * @param saldoInicial Valor inicial do saldo da conta
     */
    public ContaPoupanca(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    /**
     * Aplica uma taxa de juros diária de 8% sobre o saldo atual da conta.
     * Este método sobrescreve o método {@code aplicarJurosDiarios} da classe {@link Conta}.
     */
    @Override
    public void aplicarJurosDiarios() {
        double juros = saldo * 0.08;
        saldo += juros;  // Aplica o juros
        System.out.println("Juros de Conta Poupança aplicado com sucesso!");
        transacoes.add("Aplicação de juros Conta Poupança: R$" + juros);
    }

    /**
     * Imprime no console o extrato da conta poupança, incluindo as transações
     * realizadas, o tipo da conta e o saldo atual.
     * Este método sobrescreve {@link Conta#imprimirExtrato()}.
     */
    @Override
    public void imprimirExtrato() {
        System.out.println("\nExtrato da conta de " + cliente + ":");
        System.out.println("\nConta tipo: Poupança");
        for (String transacao : transacoes) {
            System.out.println("- " + transacao);
        }
        System.out.println("Saldo atual: R$" + saldo);
    }
}