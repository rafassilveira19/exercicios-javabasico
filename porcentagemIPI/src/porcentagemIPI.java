
import java.util.Scanner;

public class porcentagemIPI {
    public static void main(String[] args) {

        double valorIPI = 0;
        String codPeca1 = "0";
        int valorPeca1 = 0;
        int quantPeca1 = 0;
        String codPeca2 = "0";
        int valorPeca2 = 0;
        int quantPeca2 = 0;
        

// - a porcentagem do IPI a ser acrescido no valor das peças
//- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
//- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
//O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
// Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Digite a porcentagem do IPI: ");
        valorIPI = scanner.nextDouble();

        System.out.println("Digite o código da 1º peça: ");
        codPeca1 = scanner.next();

        System.out.println("Digite o valor da 1º peça: ");
        valorPeca1 = scanner.nextInt();

        System.out.println("Digite o quantidade de peças da 1ª peça: ");
        quantPeca1 = scanner.nextInt();

        System.out.println("Digite o código da 2ª peça: ");
        codPeca2 = scanner.next();

        System.out.println("Digite o valor da 2ª peça: ");
        valorPeca2 = scanner.nextInt();

        System.out.println("Digite o quantidade de peças da 2ª peça: ");
        quantPeca2 = scanner.nextInt();

        double valorTotal = (valorPeca1 * quantPeca1 + valorPeca2 * quantPeca2) * (valorIPI / 100 + 1);
        
        System.out.printf("O valor total a ser pago é: R$ %.2f%n", valorTotal);

        scanner.close();

    }

   
}
