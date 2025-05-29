import java.util.ArrayList;
import java.util.Scanner;

record Aluno(String nome, String matricula, double mediaFinal) {}

public class Main {
    public static void main(String[] args) {
        var alunos = new ArrayList<Aluno>();
        var scanner = new Scanner(System.in);

        System.out.println("Digite os dados dos 10 alunos:");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("\nAluno %d:\nNome: ", i);
            String nome = scanner.nextLine();
            
            System.out.print("Matrícula: ");
            String matricula = scanner.nextLine();
            
            System.out.print("Média Final: ");
            double mediaFinal = scanner.nextDouble();
            scanner.nextLine();
            
            alunos.add(new Aluno(nome, matricula, mediaFinal));
        }

        var aprovados = alunos.stream().filter(a -> a.mediaFinal() >= 5.0).toList();
        var reprovados = alunos.stream().filter(a -> a.mediaFinal() < 5.0).toList();

        System.out.println("\n=== APROVADOS ===");
        aprovados.forEach(a -> System.out.printf("%-20s %-15s %.1f\n", a.nome(), a.matricula(), a.mediaFinal()));
        
        System.out.println("\n=== REPROVADOS ===");
        reprovados.forEach(a -> System.out.printf("%-20s %-15s %.1f\n", a.nome(), a.matricula(), a.mediaFinal()));
    }
}