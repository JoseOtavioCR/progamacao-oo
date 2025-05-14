/**
 *
 * Classe principal que inicializa e executa a simulação de combate entre personagens.
 *
 *  @author José Otávio
 */
public class Main {

    /**
     * Método principal que instancia objetos das classes Guerreiro, Mago e Arqueiro,
     * exibe seus status, realiza ataques e usa habilidades especiais.
     *
     * @param args argumentos da linha de comando (não utilizados neste programa)
     */
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro("Thorgal");
        Mago m = new Mago("Merlino");
        Arqueiro a = new Arqueiro("Legolis");

        g.status();
        m.status();
        a.status();

        g.atacar(m);
        m.usarHabilidadeEspecial();
        a.usarHabilidadeEspecial();

        g.status();
        m.status();
        a.status();
    }
}