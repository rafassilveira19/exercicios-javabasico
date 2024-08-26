import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class lerIdade {
    public static void main(String[] args) {

        // Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
        // mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
        // (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.) 

        int diaNascimento = 0;
        int mesNascimento = 0;
        int anoNascimento = 0;
        LocalDate dataAtual = LocalDate.now();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println ("Digite o dia que você nasceu:");
            diaNascimento = scanner.nextInt();

            System.out.println ("Digite o mês que você nasceu:");
            mesNascimento = scanner.nextInt();

            System.out.println ("Digite o ano que você nasceu:");
            anoNascimento = scanner.nextInt();

            LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);

            long idadeEmDias = ChronoUnit.DAYS.between(dataNascimento, dataAtual);
        
            System.out.println("Você tem " + idadeEmDias + " dias de vida.");
        }


        
     
    }
}




