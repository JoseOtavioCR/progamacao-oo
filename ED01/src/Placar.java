import java.util.ArrayList;
import static java.lang.System.out;

public class Placar {
    private ArrayList<Jogador> ranking;

    public Placar(){
           this.ranking = new ArrayList<Jogador>();
    }

    //Métodos

    public void adicionarJogador(Jogador j){
        ranking.add(j);
    }

    public void mostrarRanking(Jogador jogador){
        for(Jogador j : ranking){
            out.println(j.getnome() + " - " + j.pontos() + " pontos " + "e " + j.tentaivas() + " tentativas totais");
        }
    }
}
