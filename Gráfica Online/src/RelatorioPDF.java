/**
 * A classe {@code RelatorioPDF} representa um relatório em formato PDF que pode ser impresso.
 * Ela implementa a interface {@code Imprimivel}.
 *
 * Cada relatório possui um autor e um número de páginas.
 *
 * @author José Otávio
 */
public class RelatorioPDF implements Imprimivel {

    /** O nome do autor do relatório. */
    private String autor;

    /** O número total de páginas do relatório. */
    private int numeroPaginas;

    /**
     * Construtor da classe {@code RelatorioPDF}.
     *
     * @param autor o nome do autor do relatório
     * @param num o número de páginas do relatório
     */
    public RelatorioPDF(String autor, int num) {
        this.autor = autor;
        this.numeroPaginas = num;
    }

    /**
     * Imprime as informações do relatório, incluindo o nome do autor
     * e o número total de páginas.
     */
    @Override
    public void imprimir() {
        System.out.println("Autor: " + autor);
        System.out.println("Total de páginas: " + numeroPaginas + "\n");
    }
}

