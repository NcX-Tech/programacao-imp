package LISTA_PONTUADA;
import java.util.Scanner;


// Uma concessionaria registrou o consumo de energia eletrica de uma residencia ao longo de varios dias. 
// Escreva um programa que leia um numero inteiro n, que representa a quantidade de dias analisados. 
// Em seguida, leia n valores inteiros que representam o consumo de energia em cada dia, armazenados em um vetor.

// O programa deve informar:

// - o consumo total no periodo
// - o consumo medio por dia
// - a quantidade de dias em que o consumo foi maior que a media.

public class atv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int v[] = new int[3];
        double media;

        for(int i = 0; i < v.length; i++){
            System.out.println("Insira o consumo de hoje: ");
            v[i] = scanner.nextInt();

            numero += v[i];
        }

        System.out.println("Consumo total: " + numero);
        
        media = numero / 3;
        System.out.println("Média: " + media);

        for(int i = 0; i < v.length; i++){
            if(numero < media){
                System.out.println("Acima da Média: " + numero);
            } else{
                System.out.println("não há nenhum dia acima da média");
            }
        }
    }
}