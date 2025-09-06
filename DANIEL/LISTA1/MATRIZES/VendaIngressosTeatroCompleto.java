package MATRIZES;

import java.util.Scanner;

public class VendaIngressosTeatroCompleto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int FILEIRAS = 10;
        final int POLTRONAS = 10;
        
        int[][] teatro = new int[FILEIRAS][POLTRONAS];
        
        // Inicializar todas as poltronas como vazias (-1)
        inicializarTeatro(teatro);
        
        System.out.print("Digite o número de tentativas de compra: ");
        int n = scanner.nextInt();
        
        processarCompras(teatro, n, scanner);
        
        exibirTeatro(teatro);
        
        scanner.close();
    }
    
    // Método para inicializar o teatro com todas as poltronas vazias
    public static void inicializarTeatro(int[][] teatro) {
        for (int i = 0; i < teatro.length; i++) {
            for (int j = 0; j < teatro[0].length; j++) {
                teatro[i][j] = -1;
            }
        }
    }
    
    // Método para processar as compras
    public static void processarCompras(int[][] teatro, int n, Scanner scanner) {
        for (int tentativa = 0; tentativa < n; tentativa++) {
            System.out.print("Tentativa " + (tentativa + 1) + ": ");
            
            int fileira = -1;
            int poltrona = -1;
            
            // Validar entrada da fileira
            while (fileira < 1 || fileira > 10) {
                System.out.print("Fileira (1-10): ");
                if (scanner.hasNextInt()) {
                    fileira = scanner.nextInt();
                    if (fileira < 1 || fileira > 10) {
                        System.out.println("Fileira inválida! Digite um número entre 1 e 10.");
                    }
                } else {
                    System.out.println("Entrada inválida! Digite um número.");
                    scanner.next(); // Limpar o buffer
                }
            }
            
            // Validar entrada da poltrona
            while (poltrona < 1 || poltrona > 10) {
                System.out.print("Poltrona (1-10): ");
                if (scanner.hasNextInt()) {
                    poltrona = scanner.nextInt();
                    if (poltrona < 1 || poltrona > 10) {
                        System.out.println("Poltrona inválida! Digite um número entre 1 e 10.");
                    }
                } else {
                    System.out.println("Entrada inválida! Digite um número.");
                    scanner.next(); // Limpar o buffer
                }
            }
            
            // Converter para índices de array (0-9)
            int fileiraIndex = fileira - 1;
            int poltronaIndex = poltrona - 1;
            
            // Verificar disponibilidade
            if (teatro[fileiraIndex][poltronaIndex] == -1) {
                teatro[fileiraIndex][poltronaIndex] = 1;
                System.out.println("✓ Ingresso vendido para fileira " + fileira + ", poltrona " + poltrona);
            } else {
                System.out.println("✗ Poltrona já foi vendida");
            }
        }
    }
    
    // Método para exibir o estado do teatro
    public static void exibirTeatro(int[][] teatro) {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("SITUAÇÃO FINAL DO TEATRO");
        System.out.println("=".repeat(50));
        System.out.println("Legenda: -1 = vazia, 1 = ocupada");
        System.out.println();
        
        System.out.print("     ");
        for (int j = 0; j < teatro[0].length; j++) {
            System.out.printf("%3d ", j + 1);
        }
        System.out.println();
        
        System.out.print("     ");
        for (int j = 0; j < teatro[0].length; j++) {
            System.out.print("----");
        }
        System.out.println();
        
        for (int i = 0; i < teatro.length; i++) {
            System.out.printf("F%2d |", i + 1);
            for (int j = 0; j < teatro[0].length; j++) {
                System.out.printf("%3d ", teatro[i][j]);
            }
            System.out.println();
        }
    }
}