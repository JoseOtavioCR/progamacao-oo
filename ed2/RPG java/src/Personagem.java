/**
 * Classe base que representa um personagem genérico com nome, vida (HP) e ataque base.
 * Pode ser estendida por classes específicas como Guerreiro, Mago, e Arqueiro.
 *
 * @author José Otávio
 */
public class Personagem {
    /**
     * Nome do personagem.
     */
    protected String nome;

    /**
     * Pontos de vida (HP) do personagem.
     */
    protected int hp;

    /**
     * Valor base de ataque do personagem.
     */
    protected int ataqueBase;

    /**
     * Construtor que inicializa um personagem com nome, vida e ataque base.
     *
     * @param nome Nome do personagem.
     * @param vida Pontos de vida (HP) iniciais.
     * @param atk  Valor de ataque base.
     */
    public Personagem(String nome, int vida, int atk){
        this.nome = nome;
        this.hp = vida;
        this.ataqueBase = atk;
    }

    /**
     * Realiza um ataque contra outro personagem, reduzindo seus pontos de vida.
     *
     * @param inimigo O personagem inimigo que será atacado.
     */
    public void atacar(Personagem inimigo){
        inimigo.hp -= this.ataqueBase;
        System.out.println("Dano de " + ataqueBase);
    }

    /**
     * Defende um ataque, reduzindo o dano recebido em 20%.
     *
     * @param dano Valor do dano recebido.
     */
    public void defender(int dano){
        this.hp -= dano * 0.8;
        System.out.println("Dano de  " + dano + "defendido");
    }

    /**
     * Usa uma habilidade especial genérica.
     * Subclasses devem sobrescrever este método para implementar habilidades específicas.
     */
    public void usarHabilidadeEspecial(){
        System.out.println("Usando habilidade especial");
    }

    /**
     * Exibe o status atual do personagem.
     */
    public void status(){
        System.out.println("Vida: " + nome);
        System.out.println("HP: " + hp);
        System.out.println("Dano de " + ataqueBase);
    }
}
