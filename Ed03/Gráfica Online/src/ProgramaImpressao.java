/**
 * A classe {@code ProgramaImpressao} contém o método {@code main}, responsável por
 * executar o programa de demonstração da impressão de diferentes tipos de objetos que
 * implementam a interface {@code Imprimivel}.
 *
 * Neste programa são criados e impressos: um documento de texto, uma imagem digital,
 * um gráfico estatístico e um relatório PDF.
 *
 * @author José Otávio
 */
public class ProgramaImpressao {

    /**
     * Método principal que executa a aplicação.
     *
     * @param args argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {

        DocumentoTexto doc = new DocumentoTexto("documento de apresentação", "Este é o conteúdo do documento");
        ImagemDigital img = new ImagemDigital("paisagem.jpg", "1920x1080");
        GraficoEstatistico grafico = new GraficoEstatistico("Distribuição de vendas", "Barra");
        RelatorioPDF rel = new RelatorioPDF("João Silva", 12);

        doc.imprimir();
        img.imprimir();
        grafico.imprimir();
        rel.imprimir();
    }
}
