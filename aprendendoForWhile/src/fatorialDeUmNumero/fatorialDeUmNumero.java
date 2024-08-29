package fatorialDeUmNumero;

import java.util.Scanner;

public class fatorialDeUmNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroPositivo;
        
        
    // Peça ao usuário para inserir um número positivo e, em seguida, calcule e imprima o fatorial desse número.

        do {
            System.out.print("Insira um número positivo: ");
            numeroPositivo = scanner.nextInt();
            
            if (numeroPositivo < 0) {
                System.out.println("Por favor, insira um número positivo.");
            }
        } while (numeroPositivo < 0); 

        int fatorial = 1;
        int i = numeroPositivo; 

       
        do {
            fatorial *= i; 
            i--; 
        } while (i > 1); 

      
        System.out.println(fatorial);
        
        scanner.close(); 
    }
}
