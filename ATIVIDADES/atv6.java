package ATIVIDADES;
import java.util.Scanner;

// 6. Escreva um programa que leia o nome e a idade de 5 pessoas e exiba, após o fim da entrada de dados, imprima a idade média do grupo e o nome das pessoas com idade acima da média.

public class atv6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] nome = new String[5];
        int[] idade = new int[5];
        int soma = 0;
        int media = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nome[i] = s.nextLine();

            System.out.print("Digite a idade de " + nome[i] + ": ");
            idade[i] = s.nextInt();
            s.nextLine();

            soma += idade[i];
        }

        media = soma / 2;
        System.out.println("Idade média: " + media);

        for(int i = 0; i < 5; i++){
            if(idade[i] > media){
                System.out.println("Acima da média: " + nome[i] + " " + idade[i]);
            }
        }
    }
}
