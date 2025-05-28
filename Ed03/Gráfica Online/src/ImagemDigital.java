/**
 * A classe {@code ImagemDigital} representa uma imagem digital que pode ser impressa.
 * Ela implementa a interface {@code Imprimivel}.
 *
 * Cada imagem possui um nome de arquivo e uma resolução.
 *
 * @author José Otávio
 */
public class ImagemDigital implements Imprimivel {

    /** O nome do arquivo da imagem. */
    private String nomeArquivo;

    /** A resolução da imagem (ex: 1920x1080). */
    private String resolucao;

    /**
     * Construtor da classe {@code ImagemDigital}.
     *
     * @param nome o nome do arquivo da imagem
     * @param res a resolução da imagem
     */
    public ImagemDigital(String nome, String res) {
        nomeArquivo = nome;
        resolucao = res;
    }

    /**
     * Imprime as informações da imagem, incluindo o nome do arquivo
     * e a resolução.
     */
    @Override
    public void imprimir() {
        System.out.println("Arquivo: " + nomeArquivo);
        System.out.println("Resolução: " + resolucao + "\n");
    }
}

