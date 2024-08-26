import java.util.Scanner;

public class reajusteSalario {
    public static void main(String[] args) {

        // Informar um saldo e imprimir o saldo com reajuste de 1%.

     Scanner scanner = new Scanner (System.in);
        

        
            System.out.println("Digite o seu saldo: ");
            double saldo = scanner.nextDouble();

        double reajuste = saldo * 0.01;
        double somaReajuste = reajuste + saldo;


        System.out.println("Seu saldo foi reajustado em 1%: " + somaReajuste);
        
        scanner.close();
    }
    }
