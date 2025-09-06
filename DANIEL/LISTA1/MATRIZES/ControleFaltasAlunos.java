package MATRIZES;

import java.util.Scanner;

public class ControleFaltasAlunos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler o número de alunos
        System.out.print("Digite o número de alunos: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        
        // Arrays para armazenar nomes e faltas
        String[] nomes = new String[n];
        int[] totalFaltas = new int[n];
        String[] presencas = new String[n]; // Para armazenar todas as presenças
        
        // Ler dados dos alunos
        for (int i = 0; i < n; i++) {
            System.out.println("\nAluno " + (i + 1) + ":");
            System.out.print("Nome: ");
            nomes[i] = scanner.nextLine();
            
            System.out.print("Presenças no semestre (30 caracteres F/P): ");
            String presencaSemestre = scanner.nextLine();
            
            // Validar se tem exatamente 30 caracteres
            if (presencaSemestre.length() != 30) {
                System.out.println("Erro: Deve haver exatamente 30 dias de aula!");
                i--; // Repetir este aluno
                continue;
            }
            
            presencas[i] = presencaSemestre.toUpperCase();
            
            // Contar faltas
            int faltas = 0;
            for (int j = 0; j < 30; j++) {
                if (presencas[i].charAt(j) == 'F') {
                    faltas++;
                }
            }
            totalFaltas[i] = faltas;
        }
        
        // Exibir alunos reprovados por falta
        System.out.println("\n" + "=".repeat(60));
        System.out.println("ALUNOS REPROVADOS POR FALTA");
        System.out.println("=".repeat(60));
        
        boolean algumReprovado = false;
        
        for (int i = 0; i < n; i++) {
            if (totalFaltas[i] > 10) {
                algumReprovado = true;
                System.out.println("\nAluno: " + nomes[i]);
                System.out.println("Total de faltas: " + totalFaltas[i] + "/30");
                System.out.print("Dias que faltou: ");
                
                // Listar os dias específicos de falta
                for (int dia = 0; dia < 30; dia++) {
                    if (presencas[i].charAt(dia) == 'F') {
                        System.out.print((dia + 1) + " ");
                    }
                }
                System.out.println();
            }
        }
        
        if (!algumReprovado) {
            System.out.println("Nenhum aluno reprovado por falta!");
        }
        
        scanner.close();
    }
}