/**
 * A classe {@code DocumentoTexto} representa um documento textual que pode ser impresso.
 * Ela implementa a interface {@code Imprimivel}.
 *
 * Cada documento possui um título e um conteúdo textual.
 *
 * Ao ser impresso, o título é exibido em letras maiúsculas, seguido do conteúdo.
 *
 * @author José Otávio
 */
public class DocumentoTexto implements Imprimivel {

    /** O título do documento. */
    private String titulo;

    /** O conteúdo do documento. */
    private String conteudo;

    /**
     * Construtor da classe {@code DocumentoTexto}.
     *
     * @param nome o título do documento
     * @param cont o conteúdo do documento
     */
    public DocumentoTexto(String nome, String cont) {
        titulo = nome;
        conteudo = cont;
    }

    /**
     * Imprime o título em letras maiúsculas seguido pelo conteúdo do documento.
     */
    @Override
    public void imprimir() {
        String tit = titulo.toUpperCase();
        System.out.println(tit);
        System.out.println(conteudo + "\n");
    }
}

