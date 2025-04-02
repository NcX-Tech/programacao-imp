import java.util.Random; //importa o ramdom

public class Exercício { //define que a classe será publica
    public static void main(String[] args) {
        int[] vetor = new int[1000]; //define o comprimento do vetor
        Random random = new Random(); // gerar números aleatórios

        for (int i = 1; i < vetor.length; i++) { 
            vetor[i] = random.nextInt(1000) + 1;
        }
        

        System.out.println("Os primeiros 1000 números gerados são:"); //gera o texto entre parenteses
        for (int i = 0; i < 1000; i++) {
            System.out.print(vetor[i] + " ");           
        }
    }

        public static int busca(double[] v, int tam, double x) { 
        for (int i = 0; i < tam; i++) {
            if (v[i] == x) {
                return i;
            }
        }
        return -1;

    }
    
}


