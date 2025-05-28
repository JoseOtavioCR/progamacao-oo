/**
 * A classe {@code GraficoEstatistico} representa um gráfico estatístico que pode ser impresso.
 * Ela implementa a interface {@code Imprimivel}.
 *
 * Cada gráfico possui um título e um tipo (como barra, linha, pizza, etc.).
 *
 * @author José Otávio
 */
public class GraficoEstatistico implements Imprimivel {

    /** O título do gráfico. */
    private String titulo;

    /** O tipo do gráfico (ex: barra, linha, pizza). */
    private String tipoGrafico;

    /**
     * Construtor da classe {@code GraficoEstatistico}.
     *
     * @param tit o título do gráfico
     * @param tipo o tipo do gráfico
     */
    public GraficoEstatistico(String tit, String tipo) {
        this.titulo = tit;
        this.tipoGrafico = tipo;
    }

    /**
     * Imprime as informações do gráfico, incluindo seu tipo e título em letras maiúsculas.
     */
    @Override
    public void imprimir() {
        System.out.println("Gráfico do tipo: " + tipoGrafico);
        String tit = titulo.toUpperCase();
        System.out.println("Título: " + tit + "\n");
    }
}

