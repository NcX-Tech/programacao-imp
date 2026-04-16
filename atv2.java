import java.util.Scanner;

// ENUNCIADO

//2. Uma escola deseja analisar o desempenho de uma turma em uma avaliacao. Escreva um programa que leia um numero inteiro n, que representa a quantidade de alunos. 
// Em seguida, leia X valores reais que representam as notas desses alunos.

//O programa deve informar:

// - a maior nota;
// - a menor nota;
// - a media da turma;
// - a quantidade de alunos com nota maior ou igual a 7.0.

public class atv2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double vetor[] = new double[4];

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Preencha a nota: ");
            vetor[i] = s.nextDouble();
        }

        // for(int i = 0; i < vetor.length; i++){            
        // System.out.println("Nota " + (i + 1) + ": " + vetor[i]);
        // }

        for(int i = 0; i < vetor.length; i++){
            if (vetor[i] > 7){
                System.out.println("Acima de 7: " + "Nota " + (i + 1) + ": " + vetor[i]);
            } 
        }
    }
}