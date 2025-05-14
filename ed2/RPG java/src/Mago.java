/**
 * Classe que representa um Mago, um tipo de personagem com menos vida e ataque moderado,
 * focado em habilidades mágicas.
 * Herda de {@link Personagem} e redefine a habilidade especial.
 *
 * O mago utiliza uma "bola de fogo" como sua habilidade especial.
 *
 * @author José Otávio
 */
public class Mago extends Personagem {

    /**
     * Construtor da classe Mago.
     * Inicializa o mago com nome, 5 de vida (HP) e 10 de ataque base.
     *
     * @param nome Nome do mago.
     */
    public Mago(String nome) {
        super(nome, 5, 10);
    }

    /**
     * Redefine a habilidade especial do mago.
     * Exibe uma mensagem indicando o uso da "bola de fogo".
     */
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Usando habilidade especial");
        System.out.println("\nUsando bola de fogo");
    }
}
