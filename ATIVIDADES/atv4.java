package ATIVIDADES;
import java.util.Scanner;

// 4. Escreva um algoritmo que Leia 5 nomes de pessoas e armazene-os em um Vetor. 
// Após a digitação do último nome, imprima-os na sequência contrária (ou seja, o último nome digitado deve ser o primeiro a ser impresso, etc)

public class atv4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] vetor = new String[5];

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um nome: ");
            vetor[i] = s.next();
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Nome: " + vetor[i]);
        }
        
    }
}
