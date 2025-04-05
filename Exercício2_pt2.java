import java.util.Random;

public class Exercício2_pt2 {
    public static void main(String[] args) {
        int[] numeros = new int[200];
        int[] frequencias = new int[20]; // Índice 0 representa o valor 1, índice 19 representa o valor 20
        Random random = new Random();

        // Preencher o vetor com valores aleatórios de 1 a 20
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(20) + 1;
            frequencias[numeros[i] - 1]++;
        }

        // Imprimir a tabela de frequências
        System.out.println("Valor | Frequência");
        for (int i = 0; i < frequencias.length; i++) {
            System.out.printf("%5d | %9d%n", i + 1, frequencias[i]);
        }
    }
}