import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        //INICAILIZAÇÕES
        Scanner sc = new Scanner(System.in);

        Jogo jogo = new Jogo();
        Placar placar = new Placar();

        //VARIÁVEIS
        int num = 0;

        int jog = 1;

        //JOGO

        while(jog == 1) {

            out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");
            out.println("Para jogar pressione 1\nPara sair pressione 2\n");
            jog = sc.nextInt();

            if (jog == 1) {

                while (jog == 1) {

                    out.println("\n-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");
                    out.println("Insira seu nome de jogador: \n");
                    String nome = sc.next();
                    Jogador jogador = new Jogador();
                    jogador.setnome(nome);
                    placar.adicionarJogador(jogador);

                    int aux = jogo.geraAleatorio();

                    while (aux != jogador.jogada(num)) {
                        out.println(aux);
                        out.println("\n-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");
                        out.println("Chute um número: \n");
                        num = sc.nextInt();
                        jogo.jogar(jogador.jogada(num), aux, jogador);

                        if (aux == jogador.jogada(num)) {
                            placar.mostrarRanking(jogador);
                                }
                    }

                    out.println("\nDeseja jogar novamente?\n 1 - Sim \n 2 - Não\n");
                    jog = sc.nextInt();
                    if(jog != 1){
                        out.println("Saindo...");
                    }
                }
            } else {
                out.println("\nSaindo...");
            }
        }
    }
}