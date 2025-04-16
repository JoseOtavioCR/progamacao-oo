public class Jogador {
    private int tentativas;
    private int pontuacao;
    private String nome;
    private int jogada;

    //Construtor

    public Jogador() {
        this.tentativas = 1;
        this.pontuacao = 0;
        this.nome = "Sem nome";
        this.jogada = 0;
    }

    //Métodos

    public void incrementarTentativas(){
        tentativas++;
    }

    public void atualizarPontuacao(int valor){
        if(valor > 0){
            pontuacao += valor;
        }
    }

    public int jogada(int num){
        jogada = num;
        return jogada;
    }

    public int pontos(){
        return pontuacao;
    }

    public int tentaivas(){
        return tentativas;
    }


    //Get

    public String getnome(){
        return this.nome;
    }

    //Set

    public void setnome(String nome){
        this.nome = nome;
    }
}
