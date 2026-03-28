import java.util.Scanner;

public class matrizes {
    public static void main(String[] args) {
        //declarando um scanner
        Scanner scanner = new Scanner(System.in);

        //criando uma matriz estática
        int[][] matriz1 = new int[3][3];
        int[] vetor = new int[3];

        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("Digite um número: /n");
                matriz1[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matriz1.length; i++){
            for (int j = 0; j < matriz1[i].length; j++){
                if (i+j == matriz1.length - 1){
                    vetor = matriz1[i][j];
                }
            }
        }

        System.out.println("Diagonal secundária: ");
    }
}
        
        // int soma = 0; //declarando uma variável que recebe os valores da soma
        // for (int i = 0; i < matriz1.length; i++) { // for referente à linha
        //     for (int j = 0; j < matriz1[i].length; j++) { // for referente à coluna
        //         if (i == j) {
        //             soma += matriz1[i][j];
        //         }
        //     }
        // }
        // System.out.println("Soma da diagonal principal: " + soma);

        