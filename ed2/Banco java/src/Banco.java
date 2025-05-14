/**
 * Classe principal que simula operações bancárias com diferentes tipos de contas.
 *
 * Cria instâncias de {@link ContaCorrente}, {@link ContaPoupanca} e {@link ContaSalario},
 * realiza operações como depósito, saque, transferência e aplicação de juros diários,
 * e imprime o extrato de cada conta.</p>
 *
 * @author José Otávio
 */
public class Banco {

    /**
     * Método principal que executa o sistema bancário de exemplo.
     */
    public static void main(String[] args) {
        // Criação de contas
        ContaCorrente cc = new ContaCorrente("Alice", 1000);
        ContaPoupanca cp = new ContaPoupanca("Bob", 1500);
        ContaSalario cs = new ContaSalario("Carlos", 1200);

        // Operações bancárias
        cc.depositar(200);          // Depósito na conta corrente
        cp.sacar(100);              // Saque da conta poupança
        cs.transferir(cc, 300);     // Transferência da conta salário para a conta corrente

        // Aplicação de juros diários
        cc.aplicarJurosDiarios();
        cp.aplicarJurosDiarios();
        cs.aplicarJurosDiarios();

        // Impressão de extratos
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        cs.imprimirExtrato();
    }
}