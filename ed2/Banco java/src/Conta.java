import java.util.ArrayList;

/**
 * Classe que representa uma conta bancária genérica com operações básicas como
 * depósito, saque, transferência, impressão de extrato e aplicação de juros.
 *
 * Esta classe serve como superclasse para tipos específicos de contas
 * como {@link ContaCorrente}, {@link ContaPoupanca} e {@link ContaSalario}.
 *
 * @author José Otávio
 */
public class Conta {

    /** Nome do cliente titular da conta */
    protected String cliente;

    /** Saldo atual da conta */
    protected double saldo;

    /** Lista de transações realizadas na conta */
    protected ArrayList<String> transacoes;

    /**
     * Construtor que inicializa a conta com nome do cliente e saldo inicial.
     *
     * @param nome Nome do cliente
     * @param saldoInicial Valor inicial do saldo
     */
    public Conta(String nome, double saldoInicial) {
        this.cliente = nome;
        this.saldo = saldoInicial;
        this.transacoes = new ArrayList<>();
    }

    /**
     * Realiza um depósito na conta, se o valor for válido.
     *
     * @param valor Valor a ser depositado
     */
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Valor depositado com sucesso!");
            transacoes.add("Depósito de R$" + valor);
        } else {
            System.out.println("Valor inválido para depósito!");
        }
    }

    /**
     * Realiza um saque da conta, se o valor for válido e houver saldo suficiente.
     *
     * @param valor Valor a ser sacado
     */
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Valor sacado com sucesso!");
            transacoes.add("Saque de R$" + valor);
        } else {
            System.out.println("Valor inválido para saque!");
        }
    }

    /**
     * Transfere um valor para outra conta, se houver saldo suficiente.
     *
     * @param destino Conta de destino da transferência
     * @param valor Valor a ser transferido
     */
    public void transferir(Conta destino, double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Valor transferido com sucesso!");
            transacoes.add("Transferência de R$" + valor + " para " + destino.cliente);
        } else {
            System.out.println("Valor de transferência inválido!");
        }
    }

    /**
     * Retorna o saldo atual da conta.
     *
     * @return O saldo atual
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Imprime no console o extrato com as transações e o saldo atual da conta.
     */
    public void imprimirExtrato() {
        System.out.println("\nExtrato da conta de " + cliente + ":");
        for (String transacao : transacoes) {
            System.out.println("- " + transacao);
        }
        System.out.println("Saldo atual: R$" + saldo);
    }

    /**
     * Aplica juros diários ao saldo da conta. A taxa padrão é de 25% do saldo.
     */
    public void aplicarJurosDiarios() {
        double juros = saldo * 0.25;
        saldo += juros;
        System.out.println("Juros aplicado com sucesso!");
        transacoes.add("Aplicação de juros: R$" + juros);
    }
}