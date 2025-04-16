package Exercicios_parteum;
import java.util.Random;

public class Exercício2 {
    public static void main(String[] args) {
        int[] numeros = new int[200];
        Random random = new Random();

        // Preencher o vetor com valores aleatórios de 1 a 20
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(20) + 1;
        }

        // Imprimir a tabela de frequências
        System.out.println("Valor | Frequência");
        for (int i = 1; i <= 20; i++) {
            int contador = 0;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j] == i) {
                    contador++;
                }
            }
            System.out.printf("%5d | %9d%n", i, contador);
        }
    }
}


//CODIGO DA SEGUNDA FORMA



