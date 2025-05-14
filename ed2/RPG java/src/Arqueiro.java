import java.util.Random;

/**
 * Classe que representa um Arqueiro, um tipo de personagem com ataque base razoável
 * e chance de causar dano crítico.
 *
 * Herda de {@link Personagem} e redefine o método {@code atacar} para incluir
 * uma chance de 20% de acerto crítico, causando o dobro do dano.
 *
 * @author José Otávio
 */
public class Arqueiro extends Personagem {

    /**
     * Gerador de números aleatórios utilizado para calcular chance de crítico.
     */
    private Random rand = new Random();

    /**
     * Construtor da classe Arqueiro.
     * Inicializa o arqueiro com nome, 10 de vida (HP) e 15 de ataque base.
     *
     * @param nome Nome do arqueiro.
     */
    public Arqueiro(String nome) {
        super(nome, 10, 15);
    }

    /**
     * Redefine o ataque do arqueiro para incluir uma chance de acerto crítico.
     * Com 20% de chance, o ataque causa o dobro do dano.
     *
     * @param inimigo O personagem inimigo que será atacado.
     */
    @Override
    public void atacar(Personagem inimigo) {
        boolean critico = rand.nextDouble() < 0.2; // 20% de chance
        int dano = this.ataqueBase;

        if (critico) {
            dano *= 2;
            System.out.println(this.nome + " acertou um CRÍTICO!");
        } else {
            System.out.println(this.nome + " atacou normalmente.");
        }

        inimigo.hp -= dano;
    }
}

