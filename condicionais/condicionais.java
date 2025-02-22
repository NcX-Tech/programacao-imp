package condicionais;

import java.util.Scanner;

public class condicionais {
  public static Scanner input = new Scanner(System.in); 

  public static void main(String[] args) {

    int peso;
    System.out.print("Digite seu peso: ");
    peso = input.nextInt();
    int altura;
    System.out.print("Digite sua altura: ");
    peso = input.nextInt();
  

    System.out.println("Você tem um IMC igual a: " + peso / altura*altura);
    if (peso / altura*altura <= 19) {
      System.out.println("Seu IMC é: " + peso / altura*altura + ", sua classificação é: Magreza Extrema");
    } else if (peso / altura*altura <= 25) {
      System.out.println("Seu IMC é: " + peso / altura*altura + ", sua classificação é: Baixo peso");
    } else if (peso / altura*altura <= 30) {
      System.out.println("Seu IMC é: " + peso / altura*altura + ", sua classificação é: Sobrepeso");
    } else {

    }
  }
}