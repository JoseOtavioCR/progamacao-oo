import java.util.Random;
import static java.lang.System.out;

import static java.lang.System.out;

public class Jogo {
    private Jogador jogador;
    private int numSecreto;

    //Construtor

    public Jogo() {
        this.jogador = jogador;
        this.numSecreto = 0;
    }

    //Métodos

    public int geraAleatorio(){
        Random rand = new Random();
        numSecreto = rand.nextInt(100) + 1;
        return numSecreto;
    }

    public void jogar(int tentativa, int num, Jogador j){
        if(tentativa == num) {
            out.println("\n-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");
            out.println("Parabéns, você acertou\n");
            j.atualizarPontuacao(num * 10);
        } else if(tentativa > num) {
            out.println("\n-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");
            out.println("\nO número secreto é menor");
            j.incrementarTentativas();
        } if(tentativa < num){
                out.println("\n-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");
                out.println("\nO número secreto é maior");
                j.incrementarTentativas();
            }
        }
    }

