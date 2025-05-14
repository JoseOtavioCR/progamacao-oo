/**
 * Classe que representa um Guerreiro, um tipo de personagem com maior resistência e ataque físico.
 * Herda de {@link Personagem} e redefine o comportamento de defesa e habilidade especial.
 *
 * @author José Otávio
 */
public class Guerreiro extends Personagem {

    /**
     * Construtor da classe Guerreiro.
     * Inicializa o guerreiro com nome, 10 de vida (HP) e 20 de ataque base.
     *
     * @param nome Nome do guerreiro.
     */
    public Guerreiro(String nome) {
        super(nome, 10, 20);
    }

    /**
     * Redefine o método de defesa para o guerreiro, que recebe apenas 50% do dano total.
     *
     * @param dano Valor do dano recebido.
     */
    @Override
    public void defender(int dano) {
        this.hp -= dano * 0.5;
        System.out.println("Dano de  " + dano + "defendido");
    }

    /**
     * Redefine a habilidade especial do guerreiro.
     * Exibe uma mensagem indicando o uso do "golpe duplo".
     */
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Usando habilidade especial");
        System.out.println("\nUsando golpe duplo");
    }
}
