import java.util.Scanner;

public class antecessoresSucessores {
    public static void main(String[] args) {
        
        //Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.

        int a = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        a = scanner.nextInt();
        
        int antecessor = a - 1;
        int sucessor = a + 1;

        System.out.println("O antecessor do número " + a + " é " + antecessor + " e o sucessor é " + sucessor);

        scanner.close();
    }
}
