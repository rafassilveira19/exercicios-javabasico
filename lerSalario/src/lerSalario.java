import java.util.Scanner;

public class lerSalario {
    public static void main(String[] args)  {

        double salarioMinimo = 0;
        double salarioUsuario = 0;


    //Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
//calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
//(1SM=R$788,00) 

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual o valor do salário mínimo atualmente?");
        salarioMinimo = scanner.nextDouble();

        System.out.println("Qual o valor do seu salário atualmente?");
        salarioUsuario = scanner.nextDouble();

        double quantSalarioMin = salarioUsuario / salarioMinimo;

        System.out.printf("Atualmente você recebe %.1f salários mínimos", quantSalarioMin);

        scanner.close();

    }
}
