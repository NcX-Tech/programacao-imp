import java.util.Random; // Importa a classe Random para gerar números aleatórios

public class Jogo { // Define a classe principal com o nome "JogoDeDados"
    public static void main(String[] args) { // Método principal onde o programa começa
        Random random = new Random(); // Cria um objeto "random" da classe Random

        int pontosJogador1 = 0; // Variável para armazenar os pontos do Jogador 1
        int pontosJogador2 = 0; // Variável para armazenar os pontos do Jogador 2

        // Loop que roda 10 vezes (de 1 até 10) representando as 10 rodadas do jogo
        for (int rodada = 1; rodada <= 10; rodada++) {
            int dado1 = random.nextInt(6) + 1; // Gera um número aleatório de 1 a 6 para o Jogador 1
            int dado2 = random.nextInt(6) + 1; // Gera um número aleatório de 1 a 6 para o Jogador 2

            // Imprime os valores dos dados
            System.out.print("Rodada " + rodada + " - Jogador 1: " + dado1 + " - Jogador 2: " + dado2 + " - ");

            // Compara os resultados dos dados para ver quem venceu a rodada
            if (dado1 > dado2) {
                System.out.println("Jogador 1 Ganhou");
                pontosJogador1++; // Adiciona 1 ponto ao Jogador 1
            } else if (dado2 > dado1) {
                System.out.println("Jogador 2 Ganhou");
                pontosJogador2++; // Adiciona 1 ponto ao Jogador 2
            } else {
                System.out.println("Empate"); // Se os valores forem iguais, é empate
            }
        }

        // Exibe a pontuação final
        System.out.println("\nPontuação Final:");
        System.out.println("Jogador 1: " + pontosJogador1);
        System.out.println("Jogador 2: " + pontosJogador2);

        // Determina o vencedor do jogo ou se houve empate
        if (pontosJogador1 > pontosJogador2) {
            System.out.println("Jogador 1 venceu o jogo!");
        } else if (pontosJogador2 > pontosJogador1) {
            System.out.println("Jogador 2 venceu o jogo!");
        } else {
            System.out.println("O jogo terminou empatado!");
        }
    }
}
