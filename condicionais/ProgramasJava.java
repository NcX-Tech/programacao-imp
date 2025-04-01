package condicionais;
import java.util.Scanner;

public class ProgramasJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n======= MENU DE PROGRAMAS =======");
            System.out.println("1 - Calcular valor de conta atrasada");
            System.out.println("2 - Calcular desconto de produto");
            System.out.println("3 - Análise de pessoas (sexo, idade, peso)");
            System.out.println("4 - Progressão Aritmética");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    contaAtrasada(scanner);
                    break;
                case 2:
                    descontoProduto(scanner);
                    break;
                case 3:
                    analisePessoas(scanner);
                    break;
                case 4:
                    progressaoAritmetica(scanner);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    // PROGRAMA 1
    public static void contaAtrasada(Scanner scanner) {
        System.out.print("Valor da conta: R$ ");
        double valorConta = scanner.nextDouble();

        System.out.print("Multa (%): ");
        double multa = scanner.nextDouble();

        System.out.print("Juros mensais (%): ");
        double jurosMensal = scanner.nextDouble();

        System.out.print("Dias de atraso: ");
        int diasAtraso = scanner.nextInt();

        if (diasAtraso >= 45) {
            System.out.println("Conta com mais de 45 dias de atraso. Não é possível calcular.");
        } else {
            double valorMulta = valorConta * (multa / 100);
            double jurosProporcional = valorConta * (jurosMensal / 100) * (diasAtraso / 30.0);
            double total = valorConta + valorMulta + jurosProporcional;

            System.out.printf("Valor total a pagar: R$ %.2f\n", total);
        }
    }

    // PROGRAMA 2
    public static void descontoProduto(Scanner scanner) {
        System.out.print("Digite a categoria (1, 2 ou 3): ");
        int categoria = scanner.nextInt();

        if (categoria < 1 || categoria > 3) {
            System.out.println("Categoria inválida!");
            return;
        }

        System.out.print("Preço do produto: R$ ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade comprada: ");
        int quantidade = scanner.nextInt();

        if (preco <= 0 || quantidade <= 0) {
            System.out.println("Preço e quantidade devem ser maiores que 0.");
            return;
        }

        double descontoCategoria = 0;
        if (categoria == 1) descontoCategoria = 0.10;
        else if (categoria == 2) descontoCategoria = 0.15;
        else descontoCategoria = 0.08;

        double descontoQuantidade = 0;
        if (quantidade <= 2) descontoQuantidade = 0.02;
        else if (quantidade <= 10) descontoQuantidade = 0.05;
        else descontoQuantidade = 0.10;

        double descontoTotal = descontoCategoria + descontoQuantidade;
        double precoComDesconto = preco * (1 - descontoTotal);
        double totalCompra = precoComDesconto * quantidade;
        double economia = (preco * quantidade) - totalCompra;

        System.out.printf("Novo preço unitário com desconto: R$ %.2f\n", precoComDesconto);
        System.out.printf("Valor total da compra: R$ %.2f\n", totalCompra);
        System.out.printf("Você economizou: R$ %.2f\n", economia);
    }

    // PROGRAMA 3
    public static void analisePessoas(Scanner scanner) {
        String continuar;
        int idadeMaisPesado = 0;
        double maiorPeso = 0;

        int totalMulheres = 0;
        int mulheresLeves = 0;

        int homensJovens = 0;
        double somaPesosHomensJovens = 0;

        do {
            System.out.print("Sexo (M/F): ");
            String sexo = scanner.next();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            System.out.print("Peso (kg): ");
            double peso = scanner.nextDouble();

            if (peso >= maiorPeso) {
                maiorPeso = peso;
                idadeMaisPesado = idade;
            }

            if (sexo.equalsIgnoreCase("F")) {
                totalMulheres++;
                if (peso < 50) mulheresLeves++;
            } else if (sexo.equalsIgnoreCase("M") && idade < 30) {
                homensJovens++;
                somaPesosHomensJovens += peso;
            }

            System.out.print("Deseja continuar (S/N)? ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("\nRESULTADOS:");
        System.out.println("Idade da pessoa mais pesada: " + idadeMaisPesado);

        if (homensJovens > 0) {
            double mediaHomens = somaPesosHomensJovens / homensJovens;
            System.out.printf("Média de peso dos homens com menos de 30 anos: %.2f kg\n", mediaHomens);
        } else {
            System.out.println("Nenhum homem com menos de 30 anos informado.");
        }

        if (totalMulheres > 0) {
            double percentual = (mulheresLeves * 100.0) / totalMulheres;
            System.out.printf("Percentual de mulheres com menos de 50 kg: %.1f%%\n", percentual);
        } else {
            System.out.println("Nenhuma mulher informada.");
        }
    }

    // PROGRAMA 4
    public static void progressaoAritmetica(Scanner scanner) {
        System.out.print("Valor inicial: ");
        int valorInicial = scanner.nextInt();

        System.out.print("Fator de incremento: ");
        int incremento = scanner.nextInt();

        System.out.print("Quantidade de termos: ");
        int quantidade = scanner.nextInt();

        System.out.println("Série da progressão aritmética:");
        for (int i = 0; i < quantidade; i++) {
            int termo = valorInicial + i * incremento;
            System.out.print(termo);
            if (i < quantidade - 1) System.out.print(", ");
        }
        System.out.println(); // Nova linha
    }
}
