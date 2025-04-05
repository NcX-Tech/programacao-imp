package vetores;

import java.util.Random; //importa o ramdom

public class Exercício { //define que a classe será publica
    public static void main(String[] args) {
        int[] vetor = new int[500]; //define o comprimento do vetor
        Preencher1(vetor);
        Preencher2(vetor);
        Imprimir(vetor);
    }
    
    public static void Preencher1(int[] v) {
        Random random = new Random(); // gerar números aleatórios
        for (int i = 1; i < v.length; i++) { 
            v[i] = random.nextInt(500) + 1;  
        }
    }

    public static void Imprimir(int[] v) {
        System.out.println("Os primeiros 500 números gerados são:"); //gera o texto entre parenteses
        for (int i = 0; i < 500; i++) {
            System.out.print(v[i] + " ");
        }        
    }

    public static int Busca(double[] v, int tam, double x) { 
        for (int i = 0; i < tam; i++) {
            if (v[i] == x) {
                return i;
            }
        }
    return -1;

    }
    
    public static void Preencher2(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = i + 1;
        }

        Random random = new Random();
        for (int i = 0; i < v.length; i++) {
            int NumAleatorio = random.nextInt(v.length);
            int temp = v[i];
            v[i] = v[NumAleatorio];
            v[NumAleatorio] = temp;
        }
    }

    public static void imprimir(int[] v) {
        System.out.println("Os primeiros 500 números gerados são:");
        for (int i = 0; i < v.length; i++) {
            System.out.printf("%4d ", v[i]);
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
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


