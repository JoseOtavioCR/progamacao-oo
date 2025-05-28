/**
 * A classe {@code ProgramaFolha} contém o método {@code main} que executa um exemplo simples
 * de cálculo de salário para diferentes tipos de funcionários.
 *
 * O programa cria um funcionário CLT e um temporário, exibe seus dados e calcula seus salários.
 *
 * @author José Otávio
 */
public class ProgramaFolha {

    /**
     * Construtor padrão da classe {@code ProgramaFolha}.
     */
    public ProgramaFolha() {
    }

    /**
     * Método principal que executa o programa.
     *
     * @param args argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        FuncionarioCLT Carlos = new FuncionarioCLT("Carlos");
        FuncionarioTemporario Ana = new FuncionarioTemporario("Ana");

        Carlos.exibirDados();
        System.out.println("Salário final: " + Carlos.calcularSalario());

        Ana.exibirDados();
        System.out.println("Salário final: " + Ana.calcularSalario());
    }
}
