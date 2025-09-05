package VETORES;
import java.util.Scanner;
public class sexta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[20];
        int[] idades = new int[20];
        int soma = 0;
        
        for(int i = 0; i < 20; i++) {
            nomes[i] = scanner.nextLine();
            idades[i] = scanner.nextInt();
            scanner.nextLine();
            soma += idades[i];
        }
        
        double media = soma / 20.0;
        System.out.println("Média: " + media);
        for(int i = 0; i < 20; i++) if(idades[i] > media) System.out.println(nomes[i]);
        
        scanner.close();
    }
}