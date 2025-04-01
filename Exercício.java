import java.util.Random;

public class Exercício {
    public static void main(String[] args) {
        int[] vetor = new int[1000]; 
        Random random = new Random(); // Objeto para gerar números aleatórios

        for (int i = 1; i < vetor.length; i++) {
            vetor[i] = random.nextInt(1000) + 1;
        }
        System.out.println("Os primeiros 1000 números gerados são:");
        for (int i = 0; i < 1000; i++) {
            System.out.print(vetor[i] + " ");           
        }
    }
}
